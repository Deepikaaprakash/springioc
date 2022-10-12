package com.alvas.springioc.AnnotationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Kid 
{
	@Autowired					//object of implementing classes will be created bcz it cant create object for interface
	@Qualifier("pistaa")
	Icecream icecream;
	void cry()
	{
		System.out.println("kid is crying");
		icecream.eat();
		System.out.println("kid is feeling happy!!");
	}
}
