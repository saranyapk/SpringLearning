package com.saranyapk.springlearning.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld2 implements InitializingBean, DisposableBean {
	private String message;

	public void setMessage(String message){
		this.message  = message;
	}
	public void getMessage(){
		System.out.println("Your Message : " + message);
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("HelloWorld2: destroy()");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("HelloWorld2: afterPropertiesSet()");
	}
}
