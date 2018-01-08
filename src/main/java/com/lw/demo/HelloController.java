package com.lw.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController

public class HelloController {
    @Value("${program.name}")
    private String pName;

    @RequestMapping("/hello")
    public String say() {return  "Hello SpringBoot";}

    @RequestMapping("hello123")
    public ModelAndView toHello() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("hello","hello page");
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping("helloName")
    public ModelAndView getProperties() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("凡",pName);
        mv.setViewName("index");
        return mv;
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
    }
}
