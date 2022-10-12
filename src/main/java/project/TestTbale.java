package com.alvas.springioc.AnnotationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTbale 
{
	public static void main(String[] args) 
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("springac.xml");
		Table table=(Table) applicationContext.getBean("tab");
		System.out.println(table.id);
		System.out.println(table.color);
		System.out.println(table.price);
	}
}
