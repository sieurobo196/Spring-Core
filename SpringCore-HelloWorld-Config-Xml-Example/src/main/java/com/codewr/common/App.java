package com.codewr.common;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {

            AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");

            HelloWorld obj = (HelloWorld) context.getBean("helloBean");
            obj.setName("kaka");
            obj.printHello();
//            HelloWorld obj1 = (HelloWorld) context.getBean("helloBean");
//            obj1.setName("kuku");
//            obj1.printHello();
//            HelloWorld obj2 = (HelloWorld) context.getBean("helloBean");
//            obj2.printHello();
            context.registerShutdownHook();
//        WelcomeWorld welcomeWorld = (WelcomeWorld) context.getBean("welcomeBean");
//        System.out.println("Welcome to website " + welcomeWorld.getText());
//        
//        WelcomeWorld welcomeWorld1 = (WelcomeWorld) context.getBean("welcomeBean");
//        System.out.println("Welcome to website 1 " + welcomeWorld1.getText());
       

    }
}
