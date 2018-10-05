package com.codewr.common;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Hello world!
 *
 */
public class HelloWorld  {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Hello " + name);
    }

    public void init() {
        
        System.out.println("khoi tao bean");
    }

    public void destroy()  {
        System.out.println("huy bean");
    }
}
