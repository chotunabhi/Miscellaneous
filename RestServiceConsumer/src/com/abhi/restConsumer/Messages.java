package com.abhi.restConsumer;

import java.util.LinkedList;
import java.util.List;

public class Messages {
	private List<Message> messages = new LinkedList<>();

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	} 
}
