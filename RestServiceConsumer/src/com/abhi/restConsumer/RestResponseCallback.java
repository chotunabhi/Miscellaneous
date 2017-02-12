package com.abhi.restConsumer;

import org.apache.http.HttpResponse;
import org.apache.http.concurrent.FutureCallback;

public class RestResponseCallback implements FutureCallback<HttpResponse> {
	IConsumer consumer;
	long sleep;
	
	public RestResponseCallback(IConsumer consumer,long sleep) {
		this.consumer = consumer;
		this.sleep = sleep;
	}

	@Override
	public void cancelled() {
		
	}

	@Override
	public void failed(Exception arg0) {
		
	}

	@Override
	public void completed(HttpResponse response) {
		try {
			Thread.sleep(sleep * 1000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		consumer.onResponse(response);
	}
}
