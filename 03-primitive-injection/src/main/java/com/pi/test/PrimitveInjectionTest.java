package com.pi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pi.beans.Account;

public class PrimitveInjectionTest {
	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/pi/commons/application-context.xml"));
		
		Account account=factory.getBean("account",Account.class);
		System.out.println(account);
	}

}
