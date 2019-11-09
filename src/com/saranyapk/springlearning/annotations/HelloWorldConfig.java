package com.saranyapk.springlearning.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.saranyapk.springlearning.beans.HelloWorld;

@Configuration
public class HelloWorldConfig {
	@Bean(initMethod = "init", destroyMethod = "destroy" )
	@Scope("prototype")
	public HelloWorld helloWorld(){
		return new HelloWorld();
	}
}