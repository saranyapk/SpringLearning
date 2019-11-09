package com.saranyapk.springlearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.saranyapk.springlearning.annotations.HelloWorldConfig;
import com.saranyapk.springlearning.beans.HelloWorld;

public class MainAppAnnotation {

	public static void main(String[] args) {
		//ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

		AnnotationConfigApplicationContext  ctx = new AnnotationConfigApplicationContext();
		ctx.register(HelloWorldConfig.class);
		ctx.refresh();

		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		helloWorld.setMessage("Hello World!");
		helloWorld.getMessage();

		ctx.registerShutdownHook();
	}
}
