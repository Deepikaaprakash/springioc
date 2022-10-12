package com.alvas.springioc.AnnotationContext;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Lion 
{
	int id;
	String color;
	String weight;
	@Value(value = "10")
	public void setId(int id) 
	{
		this.id = id;
	}
	@Value(value = "White")
	public void setColor(String color) 
	{
		this.color = color;
	}
	@Value(value = "56")
	public void setWeight(String weight) 
	{
		this.weight = weight;
	}
}