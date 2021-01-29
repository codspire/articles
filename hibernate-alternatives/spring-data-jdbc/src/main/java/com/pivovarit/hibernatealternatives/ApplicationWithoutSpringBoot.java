package com.pivovarit.hibernatealternatives;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ApplicationWithoutSpringBoot {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationWithoutSpringBootConfig.class);
		Runner runner = context.getBean(Runner.class);

		runner.run(args);
	}
}
