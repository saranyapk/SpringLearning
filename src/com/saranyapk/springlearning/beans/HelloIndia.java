package com.saranyapk.springlearning.beans;

import org.springframework.beans.factory.annotation.Required;

public class HelloIndia {
	private String message1;
	private String message;
	private String message3;

	@Required
	public void setMessage1(String message){
		this.message1 = message;
	}
	public void setMessage(String message){
		this.message = message;
	}
	public void setMessage3(String message){
		this.message3 = message;
	}
	public void getMessage1(){
		System.out.println("India Message1 : " + message1);
	}
	public void getMessage(){
		System.out.println("India Message : " + message);
	}
	public void getMessage3(){
		System.out.println("India Message3 : " + message3);
	}
}
