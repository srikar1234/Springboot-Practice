package org.practice.Spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	System.out.println( "Hello World!" );
    	
    	//This below line creates a container for us
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
//      Old way to solve
//      Alien obj = new Alien();
//      obj.code();
        
//      New way to solve        
//        Alien obj = (Alien) context.getBean("alien");
//        obj.code();

        Alien obj1 = (Alien) context.getBean("alien");
        System.out.println(obj1.getAge());
        obj1.code();
        
        obj1.setAge(21);
        
        Alien obj2 = (Alien) context.getBean("alien");
        System.out.println(obj2.getAge());
        obj2.code();
        
    }
}
