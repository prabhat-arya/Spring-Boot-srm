package com.fa.beans;

public class MessageWriter {
	IMessageConverter messageConverter=null;


	public void write(String message) {
		String msg=messageConverter.convert(message);
		System.out.println(msg);
	}

	public void setMessageConverter(IMessageConverter messageConverter) {
		this.messageConverter = messageConverter;
	}
	
	
}
