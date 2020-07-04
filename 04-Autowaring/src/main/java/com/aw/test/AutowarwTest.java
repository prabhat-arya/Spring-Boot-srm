package com.aw.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.aw.beans.Robot;

public class AutowarwTest {
	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/aw/commons/application-context.xml"));
		Robot robot=factory.getBean("robot", Robot.class);
		robot.louanch();
	}

}
