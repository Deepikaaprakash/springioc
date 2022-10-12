package com.alvas.springioc.AnnotationContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee 
{
	@Autowired						//creates the object for address class also
	Address address;
	void details()
	{
		address.description();
		System.out.println("Im an employee in hcl!!");
	}
}
