package com.saranyapk.springlearning.processors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class InitHelloWorld implements BeanPostProcessor, Ordered  {
	private int order;
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {

		System.out.println("BeforeInitialization : " + beanName);
		return bean;  // you can return any other object as well
	}
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {

		System.out.println("AfterInitialization : " + beanName);
		return bean;  // you can return any other object as well
	}

	public void setOrder(int order) {
		this.order = order;
	}

	@Override
	public int getOrder() {
		return order;
	}
}
