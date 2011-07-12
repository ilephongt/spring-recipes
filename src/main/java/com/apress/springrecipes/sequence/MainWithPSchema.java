package com.apress.springrecipes.sequence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainWithPSchema {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String config = "com/apress/springrecipes/sequence/MainWithPSchema.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        SequenceGenerator generator = (SequenceGenerator) context.getBean("sequenceGenerator");
        System.out.println(generator.getSequence());
        System.out.println(generator.getSequence());
    }

}