package com.fa.beans;

public class PDFMessageConverter implements IMessageConverter {
	@Override
	public String convert(String message) {
		
		return "<pdf> "+message+" </pdf>";
	}
	
	

}
