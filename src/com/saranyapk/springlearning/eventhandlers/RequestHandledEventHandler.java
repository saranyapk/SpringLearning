package com.saranyapk.springlearning.eventhandlers;

import org.springframework.context.ApplicationListener;
import org.springframework.web.context.support.RequestHandledEvent;

public class RequestHandledEventHandler implements ApplicationListener<RequestHandledEvent> {
	@Override
	public void onApplicationEvent(RequestHandledEvent event) {
		System.out.println("In RequestHandledEventHandler...");
	}
}

