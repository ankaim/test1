package com.example.test1;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    //Это из тестовой ветки

    @RequestMapping("/")
    public String userWeb(){
        return "index";
    }
}
