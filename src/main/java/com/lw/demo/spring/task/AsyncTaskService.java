package com.lw.demo.spring.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {
    @Async
    public void executeAsyncTask(Integer i) {
        System.out.println("执行异步任务:" + i);
    }

    @Async
    public void executeAsyncTasPlus(Integer i) {
        System.out.println("执行异步任务+1：" +(i+ 1));
    }
}
