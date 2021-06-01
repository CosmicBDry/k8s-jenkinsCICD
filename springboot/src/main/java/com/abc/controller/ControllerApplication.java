package com.abc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerApplication {
    @RequestMapping("/web")
    @ResponseBody
    public String webquick(){
        return("Hello MySpringBoot!");
    }
}
