package com.fa.test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.fa.beans.HTMLMessagConverter;
import com.fa.beans.IMessageConverter;
import com.fa.beans.MessageWriter;
import com.fa.beans.PDFMessageConverter;

public class FirstAppTest {
	public static void main(String[] args) {

		//   Without Spring
	    //  ----------------
		  //object create
		  IMessageConverter messageConverter=new PDFMessageConverter();
		  MessageWriter messageWriter=new MessageWriter();
		  //injection perform 
		  messageWriter.setMessageConverter(messageConverter);
		 
//-----------------------------------------------------------------------------------------------		
		     //     With Spring
		     //      -----------
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/fa/commons/applicationContext.xml"));
		
		MessageWriter messageWritere=factory.getBean("messageWriter", MessageWriter.class);
		
		messageWritere.write("Welcom to spring");
		messageWritere.write("Welcom to spring");
	}

}
