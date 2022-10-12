package com.alvas.springioc.AnnotationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCat 
{
	public static void main(String[] args)
	{
//		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("springac.xml");
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Myconfig.class);
		Cat cat=(Cat) applicationContext.getBean("cat");    			  //bean id is same as class name bcz no id in xml file
		cat.sleep();
	}
}
