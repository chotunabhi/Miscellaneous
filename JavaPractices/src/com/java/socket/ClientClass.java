package com.java.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientClass {
	private String host;
	private int port;
	
	public ClientClass(String host, int port) {
		super();
		this.host = host;
		this.port = port;
	}
	public void runClient(){
		try {
			
			Socket clientSocket = new Socket(host,port);
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),true);
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			 BufferedReader stdIn =
				        new BufferedReader(
				            new InputStreamReader(System.in));
			 String userInput;
			 while ((userInput = stdIn.readLine()) != null) {
			     out.println(userInput);
			     System.out.println("server: " + in.readLine());
			 }
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String args[]){
		new ClientClass("localhost", 8018).runClient();
	}
}
