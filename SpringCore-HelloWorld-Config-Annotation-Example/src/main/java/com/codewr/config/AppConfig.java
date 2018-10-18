package com.codewr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.codewr.hello.HelloWorld;
import com.codewr.hello.impl.HelloWorldImpl;

@Configuration
public class AppConfig {

    @Bean(name = "helloBean")
    public HelloWorld helloWorld() {
       
        return new HelloWorldImpl();
    }

}
