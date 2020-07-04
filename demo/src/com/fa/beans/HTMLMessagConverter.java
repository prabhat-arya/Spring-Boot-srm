package com.fa.beans;

public class HTMLMessagConverter implements IMessageConverter{

	@Override
	public String convert(String message) {
		
		return "<html><body> "+message+" </body></html>";
	}
}
