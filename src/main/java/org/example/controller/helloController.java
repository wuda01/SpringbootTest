package org.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class helloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello Word !";
    }
}
