package com.codewr.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.codewr.output.OutputHelper;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "SpringBeans.xml");

        OutputHelper output = (OutputHelper) context.getBean("OutputHelper");
        output.generateSCVOutput();
    }
}
