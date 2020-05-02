package com.nttdata.Employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");

    	employee emp = (employee)c.getBean("empl");
    	emp.display();
    }
}
