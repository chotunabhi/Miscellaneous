package com.abhi.restConsumer;

import org.apache.http.HttpResponse;

public interface IConsumer {
	public void onRequest(String url,long sleep);
	public void onResponse(HttpResponse response);	
}
