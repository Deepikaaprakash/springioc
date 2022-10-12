package com.alvas.springioc.AnnotationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestEmployee
{
	public static void main(String[] args)
	{
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Myconfig.class);			//every new keyword is the constructor of that class
		Employee employee=(Employee) applicationContext.getBean("employee");
		employee.details();
	}
}
