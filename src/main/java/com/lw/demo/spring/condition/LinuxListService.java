package com.lw.demo.spring.condition;

import org.springframework.stereotype.Service;

@Service
public class LinuxListService implements ListService {
    @Override
    public String showLisCMD() {
        return "ls";
    }
}
