package com.saranyapk.springlearning.eventhandlers;

import org.springframework.context.ApplicationListener;

import com.saranyapk.springlearning.events.CustomEvent;

public class CustomEventHandler implements ApplicationListener<CustomEvent> {
	public void onApplicationEvent(CustomEvent event) {
		System.out.println(event.toString());
	}
}