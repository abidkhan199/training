/**
 * 
 */
package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Vrinda
 *
 */
public class HelloSpringApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		
		// new method for fortuneService
		System.out.println(theCoach.getFortune());

		// close context
		context.close();
	}

}
