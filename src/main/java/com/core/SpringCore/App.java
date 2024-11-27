package com.core.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//    	ApplicationContext context = new ClassPathXmlApplicationContext("com/core/SpringCore/config.xml");    	
//    	
//		Student st=context.getBean("student",Student.class);
////		Student st=(Student) context.getBean("student");
//	
//		System.out.println(st);
//   
    	
    	ApplicationContext con=new ClassPathXmlApplicationContext("com/core/SpringCore/config.xml");
    	Employee em=(Employee) con.getBean("employee");
    	System.out.println(em);
    	
    	
    }
}
