package com.java.cassandra;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.ResultSetFuture;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.SimpleStatement;
import com.datastax.driver.core.Statement;
import com.datastax.driver.core.querybuilder.QueryBuilder;


public class MyClient {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException, IOException {
		MyClient client = new MyClient();
		client.connect("nj12mhf0098.mhf.mhc",8042);
		//		Thread.sleep(1000*60*1);
		//		System.out.println("done");
		client.close();

	}
	private Cluster cluster;
	public void connect(String node,int port) throws InterruptedException, ExecutionException, TimeoutException, IOException {

		cluster = Cluster.builder().addContactPoint(node).withPort(port).withCredentials("rtdtapp", "rtdtapp").build();

		Session session = cluster.connect();
		System.out.println("connected");

		String query = "";
		
		query = QueryBuilder.select("data_field_id","data_field_name","full_name").from("rtdt_refdata","data_fields").getQueryString();
		Statement st = new SimpleStatement(query);
		System.out.println(query);
		ResultSetFuture resultSet = session.executeAsync(st);

		ResultSet rs = resultSet.getUninterruptibly();
		List<Row> rows = rs.all();
		int i = 0;
		StringBuffer sb = new StringBuffer("BEGIN BATCH\n");
		for (Row row : rows) {
//			System.out.println(i++);
			int data_field_id = row.getInt("data_field_id");
			String data_field_name= row.getString("data_field_name");
			String full_name = row.getString("full_name");
		
			if(full_name == null)
				continue;
			
			String words[] = full_name.trim().split(" ");
			
			if(words.length > 1){
				String newWord = "";
				for(String word:words)
					if(!word.trim().isEmpty())
					newWord += word.trim()+" ";
					else
						System.out.println(data_field_name);
				
				sb.append("UPDATE rtdt_refdata.data_fields set full_name='"+newWord.trim()+"' where data_field_id="+data_field_id+";\n");
			}
		}
		sb.append("APPLY BATCH");
//		System.out.println(sb.toString());
		
		FileWriter fw = new FileWriter("data_format.cql");
		fw.write(sb.toString());
		fw.close();
		
		System.out.println("executed");
	}
	public void close() {
		cluster.close();
	}
}
