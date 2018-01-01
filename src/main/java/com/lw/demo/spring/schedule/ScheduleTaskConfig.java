package com.lw.demo.spring.schedule;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.lw.demo.spring.schedule")
@EnableScheduling
public class ScheduleTaskConfig {
}
