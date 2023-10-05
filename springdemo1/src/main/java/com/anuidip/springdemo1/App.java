package com.anuidip.springdemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anuidip.springdemo1.Vehicle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
    	
    	Vehicle obj=(Vehicle) con.getBean("Vehicle");
    	obj.drive();
        System.out.println( "Hello World!" );
    }
}
