package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		// Load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("MyCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("MyCoach", Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\nPointing the same object : " + result);
		System.out.println("\nMemory location of theCoach : " + theCoach);
		System.out.println("\nMemory location of alphaCoach : " + alphaCoach);
		
		// Close context
		context.close();

	}

}
