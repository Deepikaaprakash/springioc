package com.alvas.springioc.AnnotationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestGiraffe {

	public static void main(String[] args)
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("springac.xml");
		Girraffe giraffe=(Girraffe) applicationContext.getBean("girraffe");
		System.out.println(giraffe.gid);
		System.out.println(giraffe.color);
		System.out.println(giraffe.height);
	}

}
