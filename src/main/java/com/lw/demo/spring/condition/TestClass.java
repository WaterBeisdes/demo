package com.lw.demo.spring.condition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestClass {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService service = context.getBean(ListService.class);
        System.out.println("************************\n" + service.showLisCMD() + "\n***********************");
    }
}
