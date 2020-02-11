package com.cpw.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class springboot {
    @ResponseBody
    @RequestMapping("/hello")
    public String Hello (){
        return "Hello World";
    }
}
