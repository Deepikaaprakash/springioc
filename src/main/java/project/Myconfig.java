package com.alvas.springioc.AnnotationContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.alvas.springioc.AnnotationContext")								//basepackage given in xml overcomes this			
public class Myconfig
{
	@Bean("cat")
	Cat getCat()
	{
		return new Cat();
	}
}
