package com.alvas.springioc.AnnotationContext;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Pistaa implements Icecream
{

	public void eat() 
	{
		System.out.println("Eating pistaa!!");
	}
	
}
