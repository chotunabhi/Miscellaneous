package com.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Set;

public class TestSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		/*SerializationISA sisa = new SerializationISA();
		InnerSerializableClass isc = new InnerSerializableClass();
		
		Set<Long> se = new HashSet<Long>();
		se.add(21L);
		se.add(22L);
		se.add(23L);
		se.add(24L);
		se.add(25L);
		isc.setSet(se);
		sisa.setInnerSerializableClass(isc);
		sisa.setA(20);
		System.out.println();
		System.out.println(isc.getSet());
		  
		  FileOutputStream fout=new FileOutputStream("f.txt");  
		  ObjectOutputStream out=new ObjectOutputStream(fout);  
		  
		  out.writeObject(sisa);  
		  out.flush();  
		  System.out.println("success");  
		  
		  
		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
		  SerializationISA  sisafile=(SerializationISA)in.readObject();  
		  System.out.println(sisafile.getInnerSerializableClass().getSet());*/
		String UNDERSCORE = "_";
		String string = new StringBuilder("1").append(UNDERSCORE).append("2").toString();
		System.out.println(string);
//		  System.out.println(sisafile.getSet());
		  
//		  in.close();  
	}

}
