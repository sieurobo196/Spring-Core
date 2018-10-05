package com.codewr.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.codewr.config.AppConfig;
import com.codewr.hello.HelloWorld;

public class App {

    public static void main(String[] args) {

        //ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld obj = (HelloWorld) context.getBean("helloBean");

        obj.printHelloWorld("Hello World");

    }
}
