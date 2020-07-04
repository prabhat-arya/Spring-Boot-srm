package com.ba.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ba.beans.Flipcart;

public class AliasTest {
	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/ba/commons/application-context.xml"));
				Flipcart flipcart=factory.getBean("flipcart", Flipcart.class);
		flipcart.placeOrder("shose", 10, 800);
	}

}
