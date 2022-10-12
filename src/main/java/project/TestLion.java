package com.alvas.springioc.AnnotationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLion {

	public static void main(String[] args)
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("springac.xml");
		Lion lion=(Lion) applicationContext.getBean("lion");
		System.out.println(lion.id);
		System.out.println(lion.color);
		System.out.println(lion.weight);
	}

}
