package com.alvas.springioc.AnnotationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestKid 
{
	public static void main(String[] args)
	{
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Myconfig.class);
		Kid kid=(Kid) applicationContext.getBean("kid");
		kid.cry();											}
}
