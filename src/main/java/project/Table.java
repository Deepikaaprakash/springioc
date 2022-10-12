package com.alvas.springioc.AnnotationContext;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "tab")		//bean id changed to tab
public class Table 
{
	int id;
	String color;
	double price;
	public Table(@Value(value = "12") int id,@Value(value ="Blue")  String color, @Value(value = "6700.00") double price) 
	{
		this.id = id;
		this.color = color;   
		this.price = price;
	}
	
}
