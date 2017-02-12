package com.abhi.restConsumer;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="message")
public class Message {
	private long messageId;
	private String message;
	private String author;
	private Date created;
	
	public Message() {
	}
	
	public Message(long messageId, String message, String author) {
		this.messageId = messageId;
		this.message = message;
		this.author = author;
	}


	public long getMessageId() {
		return messageId;
	}
	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
}
