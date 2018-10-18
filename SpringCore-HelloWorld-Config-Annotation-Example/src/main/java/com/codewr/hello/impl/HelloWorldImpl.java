package com.codewr.hello.impl;

import com.codewr.hello.HelloWorld;

public class HelloWorldImpl implements HelloWorld {

    @Override
    public void printHelloWorld(String msg) {

        System.out.println(msg);
    }

}
