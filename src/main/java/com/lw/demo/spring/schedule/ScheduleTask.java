package com.lw.demo.spring.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ScheduleTask  {
    private  static final SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public  void reportCurrTime() {
        System.out.println(format.format(new Date()) + "Schedule 任务！");
    }

    @Scheduled(cron = "0 08 18 ? * *")
    public void fixTimeExecution() {
        System.out.println(format.format(new Date()) + "corn 任务！");

    }
}
