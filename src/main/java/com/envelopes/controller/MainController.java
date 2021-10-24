package com.envelopes.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {


    @RequestMapping("/index")
    public String envelopes(@RequestParam(name = "name", required = false,
            defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "envelopes";
    }


}
//
////    @GetMapping("/login")
////    public String login() {
////        return "login";
////    }
////
////    @GetMapping("/")
////    public String home() {
////        return "index";
////    }
//
//}
