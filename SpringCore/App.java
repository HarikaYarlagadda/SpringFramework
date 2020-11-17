package com.harika.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
    	Car obj=(Car)context.getBean("car");
       obj.drive();
    	
    	
    	}
}
