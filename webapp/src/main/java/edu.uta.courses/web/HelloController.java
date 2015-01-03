package edu.uta.courses.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by veritymark on 3.1.2015.
 */

public class HelloController {

    @RequestMapping("/")
    public String helloWorld(Model model) {
        model.addAttribute("greeting", "hello World!");

        return "hello";
    }

}
