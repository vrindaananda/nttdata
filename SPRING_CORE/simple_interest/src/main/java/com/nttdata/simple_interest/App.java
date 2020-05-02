package com.nttdata.simple_interest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
    SI s=(SI)a.getBean("collect");
   System.out.println( "simple interest is"+s.simple());
    
    
}
}