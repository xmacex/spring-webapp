package edu.uta.courses.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by me on 21.1.2015.
 */
@Controller
public class NumberListController {

    @RequestMapping(value = "/numberlist/start", method = RequestMethod.GET)
    public String startAskingNumbers() {
        return "/numberlist/start";
    }


    @RequestMapping(value = "/numberlist/get", method = RequestMethod.POST)
    public String getNumbers(@RequestParam("number") String number, Model model) {
        // put to ArrayList<String> which is in session. Implement!

        // put a copy of that list to model
        // model.addAttribute("arrayListOfNumbers", arrayListOfNumbers)

        return "/numberlist/ask";
    }


    @RequestMapping(value = "/numberlist/complete", method = RequestMethod.GET)
    public String getNumbers(Model model) {
        // reset/remove/invalidate ArrayList<String> which is in session. Implement!


        return "/numberlist/complete";
    }

}
