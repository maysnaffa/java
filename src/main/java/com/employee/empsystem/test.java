package com.employee.empsystem;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @RequestMapping("/emps")
    public List<String> controller()
    {
         return List.of("hi","from","test");

    }
    
}
