package com.network.nio;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

public class ClientMessageHandler implements CompletionHandler<AsynchronousSocketChannel, Void> {
	private AsynchronousSocketChannel channel = null;
	private ByteBuffer buffer = null;
	private boolean isRead = false;
	
	public ClientMessageHandler(AsynchronousSocketChannel channel) {
		this.channel = channel;
		this.buffer = ByteBuffer.allocate(Integer.MAX_VALUE);
	}
	@Override
	public void completed(AsynchronousSocketChannel result, Void attachment) {
		this.buffer.clear();
		channel.read(buffer);
			StringBuffer sb = new StringBuffer();
	}

	@Override
	public void failed(Throwable exc, Void attachment) {
		// TODO Auto-generated method stub

	}

}
