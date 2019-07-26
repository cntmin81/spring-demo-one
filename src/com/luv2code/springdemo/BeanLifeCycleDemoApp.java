package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {

		// Load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("MyCoach", Coach.class);
		
		System.out.println(theCoach.getDailyFortune());
		
		
		// Close context
		context.close();

	}

}
