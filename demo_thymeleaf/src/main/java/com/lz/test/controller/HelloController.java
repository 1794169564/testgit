package com.lz.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

        @RequestMapping("/lzz")
        public String tolzz(Model model){
            model.addAttribute("username","吱吱吱");
            return "index";
        }
}



