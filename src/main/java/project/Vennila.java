package com.alvas.springioc.AnnotationContext;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary			//2 implementing classes are there bean id gets confused to which class object has to create so @primary used

public class Vennila implements Icecream
{

	public void eat() 
	{
		System.out.println("Eating vennila!!");
	}
	
}
