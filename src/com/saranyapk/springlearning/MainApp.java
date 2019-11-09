package com.saranyapk.springlearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.saranyapk.springlearning.beans.HelloIndia;
import com.saranyapk.springlearning.beans.HelloWorld;
import com.saranyapk.springlearning.beans.HelloWorld2;
import com.saranyapk.springlearning.beans.TextEditor;
import com.saranyapk.springlearning.events.CustomEventPublisher;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("resources/Beans.xml");

		context.start();

		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();

		obj.setMessage("Hello World! Have a new great day!");

		HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
		obj1.getMessage();

		HelloWorld2 helloWorld2 = (HelloWorld2) context.getBean("helloWorld2");
		helloWorld2.getMessage();

		HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
		objB.getMessage1();
		objB.getMessage();
		objB.getMessage3();

		TextEditor te = (TextEditor) context.getBean("textEditor");
		te.spellCheck();

		CustomEventPublisher cvp =
				(CustomEventPublisher) context.getBean("customEventPublisher");

		cvp.publish();
		cvp.publish();

		context.refresh();
		context.stop();

		context.registerShutdownHook();
	}
}