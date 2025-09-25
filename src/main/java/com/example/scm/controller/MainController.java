package com.example.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;




/**
 * This Controller manages public endpoints of an application
 * @author Shaad Bangi
 * @version 1.1
 */

@Controller
public class MainController {

    @GetMapping
    public String getMethodName() {
        return new String("index");
    }
    


}
