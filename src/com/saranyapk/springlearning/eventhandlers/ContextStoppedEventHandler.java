package com.saranyapk.springlearning.eventhandlers;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class ContextStoppedEventHandler implements ApplicationListener<ContextStoppedEvent> {
	@Override
	public void onApplicationEvent(ContextStoppedEvent event) {
		System.out.println("In ContextStoppedEventHandler...");
	}
}
