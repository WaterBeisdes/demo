package com.lw.demo.spring.condition;

import org.springframework.stereotype.Service;

@Service
public class WindowsListService implements ListService {
    @Override
    public String showLisCMD() {
        return "dir";
    }
}
