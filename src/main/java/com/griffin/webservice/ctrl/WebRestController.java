package com.griffin.webservice.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }

}
