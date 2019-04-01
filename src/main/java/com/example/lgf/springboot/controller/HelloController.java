package com.example.lgf.springboot.controller;

import com.example.lgf.springboot.entity.PersonProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
   private PersonProperties personProperties;
   /* @Value("${name1}")
    private String name1;*/
    @RequestMapping(value="/hello",method =RequestMethod.GET)
    public String index(){
        return personProperties.getName()+personProperties.getAge();
    }
}
