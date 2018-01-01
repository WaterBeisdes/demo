package com.lw.demo.spring.task;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService service = context.getBean(AsyncTaskService.class);

        for (int i = 0; i < 10; i++) {
            service.executeAsyncTask(i);
            service.executeAsyncTasPlus(i);
        }

        context.close();
    }
}
