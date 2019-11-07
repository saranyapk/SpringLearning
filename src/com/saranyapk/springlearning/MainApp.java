package com.saranyapk.springlearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.saranyapk.springlearning.beans.HelloIndia;
import com.saranyapk.springlearning.beans.HelloWorld;
import com.saranyapk.springlearning.beans.HelloWorld2;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("resources/Beans.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();

		obj.setMessage("Hello World! Have a new great day!");

		HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
		obj1.getMessage();

		HelloWorld2 helloWorld2 = (HelloWorld2) context.getBean("helloWorld2");
		helloWorld2.getMessage();

		HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
		objB.getMessage1();
		objB.getMessage2();
		objB.getMessage3();

		context.registerShutdownHook();
	}
}