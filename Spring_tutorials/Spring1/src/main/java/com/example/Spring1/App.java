package com.example.Spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
         //different ways to configure spring beans (xml,java,annotation based)
        Alien obj1 = (Alien) context.getBean("alien1");
//        obj1.setAge(21);  one way is to set the age through code option 1 
        System.out.println(obj1.getAge());
        obj1.coding();
        
//        Alien obj2 = (Alien) context.getBean("alien1");
//        System.out.println(obj2.age);
        //obj2.coding();
       
        
    }
}