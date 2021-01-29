package com.pivovarit.hibernatealternatives;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan(basePackages = "com.pivovarit.hibernatealternatives")
@EnableTransactionManagement(proxyTargetClass=true)
//@EnableJpaRepositories("com.example.domain.repository")
@Configuration
public class ApplicationWithoutSpringBootConfig {


}
