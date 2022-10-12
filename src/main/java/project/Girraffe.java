package com.alvas.springioc.AnnotationContext;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Girraffe 
{
	@Value(value = "124")
	int gid;
	@Value(value = "17.8")
	double height;
	@Value(value="yellow")
	String color;
	
}
