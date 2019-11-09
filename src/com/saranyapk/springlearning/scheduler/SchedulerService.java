package com.saranyapk.springlearning.scheduler;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;

public class SchedulerService {

	@Scheduled(cron = "*/5 * * * * ?")
	public void cronMethod() {
		System.out.println("Method executed at every 5 seconds. Current time is :: " + new Date());
	}

	@Scheduled(fixedDelay = 6000)
	public void fixedDelayMethod() {
		System.out.println("Method executed at every 6 seconds. Current time is :: " + new Date());
	}

	@Scheduled(fixedRate = 7000)
	public void fixedRateMethod() {
		System.out.println("Method executed at every 7 seconds. Current time is :: " + new Date());
	}
}
