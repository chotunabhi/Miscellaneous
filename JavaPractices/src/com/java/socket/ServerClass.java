package com.java.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerClass {
	private int port;

	public ServerClass(int port) {
		super();
		this.port = port;
	}
	public void runServer(){
		ServerSocket serverSocket = null ;
		try {
			System.out.println("running on port:"+port);
			serverSocket= new ServerSocket(port);
			int clientCount = 0;
			while(true){
				final Socket clientSocket = serverSocket.accept();
				System.out.println("Connection Established"+(++clientCount));

				new Thread(new Runnable() {

					@Override
					public void run() {
						// TODO Auto-generated method stub

						try {
							PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
							BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

							while(true){

								if(!clientSocket.isConnected())
									break;
								String msg = reader.readLine();								
								writer.println(msg);
								System.out.println("Client:"+msg);
								writer.flush();
							}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						finally{
							try {
								clientSocket.close();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}

					}
				}).start();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				if(serverSocket != null)
					serverSocket.close();
			} catch (final IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ServerClass(Integer.parseInt(args[0])).runServer();

	}

}
