package edu.uta.courses.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by me on 17.1.2015.
 */

@Controller
public class HelloPostController {

    @RequestMapping(value="formexample/{dummy}", method= RequestMethod.GET)
    public String getExample(@RequestParam("name") String name) {

        return "form/example";
    }

    @RequestMapping(value="formexample/{dummy}", method= RequestMethod.POST)
    public String postExample() {

        return "form/exampled";
    }

}
