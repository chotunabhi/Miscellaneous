package com.network.nio;

import java.net.InetSocketAddress;
import java.nio.channels.AsynchronousServerSocketChannel;

public class NioSocketServer
{
	public NioSocketServer()
	{
		try
		{
			// Create an AsynchronousServerSocketChannel that will listen on port 5000
			final AsynchronousServerSocketChannel listener = AsynchronousServerSocketChannel.open().bind(new InetSocketAddress(5000));

			// Listen for a new request
			listener.accept( null, new ServerSocketListener(listener));
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}


	public static void main( String[] args )
	{
		NioSocketServer server = new NioSocketServer();
		try
		{
			Thread.sleep( 60000 );
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
}