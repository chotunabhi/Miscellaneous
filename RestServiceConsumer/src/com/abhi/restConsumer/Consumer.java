package com.abhi.restConsumer;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Future;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import org.apache.http.nio.client.HttpAsyncClient;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

public class Consumer implements IConsumer{

	public static void main(String[] args) throws InterruptedException {

		String url = "http://localhost:8080/messenger/webapi/messages/2";

//		synchronousRestCall(url);
		Consumer consumer = new Consumer();
		consumer.onRequest(url,2L);
		url = "http://localhost:8080/messenger/webapi/messages/1";
		consumer.onRequest(url,0L);

	}

	private static void asynchronousRestCall(String url) {

	}

	private static void synchronousRestCall(String url) {
		CloseableHttpClient client = HttpClients.createDefault();
		HttpGet get = new HttpGet(url);
		get.addHeader("Accept","application/json");

		try {
			CloseableHttpResponse response = client.execute(get);
			Header[] headers = response.getHeaders("Content-Type");
			HttpEntity httpEntity = response.getEntity();

			List<Message> messages = new LinkedList<>();
			String body = EntityUtils.toString(httpEntity);

			Gson gson = new Gson();
			messages = gson.fromJson(body, List.class); 

			System.out.println(messages);

			response.close();			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onRequest(String url,long sleep) {
		CloseableHttpAsyncClient client = HttpAsyncClients.createDefault();
		client.start();
		HttpGet get = new HttpGet(url);
		get.addHeader("Accept","application/json");
		FutureCallback<HttpResponse> callback = new RestResponseCallback(this,sleep);
		try {
			HttpContext context = new BasicHttpContext();
			client.execute(get,callback);	

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			//			e.printStackTrace();
		}
	}

	@Override
	public void onResponse(HttpResponse response) {
		HttpEntity httpEntity = response.getEntity();

		List<Message> messages = new LinkedList<>();

		try {
			String body = EntityUtils.toString(httpEntity);
			Gson gson = new Gson();
			messages = gson.fromJson(body, List.class); 

		} catch (ParseException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		System.out.println(messages);

	}
}
