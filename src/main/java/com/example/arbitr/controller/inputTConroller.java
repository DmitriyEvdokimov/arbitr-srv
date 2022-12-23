package com.example.arbitr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

@RequestMapping("/inputT")
public class inputTConroller {

    @GetMapping("")
    public String toinputT (){

return ("inputT");
    }

    @GetMapping("/inputT")
    public String inputT(){
        return ("templates/inputT");
    }

//    @PostMapping("/arbitrSearch")
//    public String createInputT(@RequestParam String text,@RequestParam String court){
//        System.out.printf(text,court);
//        return("redirect:/index") ;
//    }


}


