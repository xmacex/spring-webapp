package edu.uta.courses.web;

import edu.uta.courses.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Created by me on 27.1.2015.
 */
@Controller
@RequestMapping("/quiz")
@SessionAttributes(value = {"rand1", "rand2"})
public class QuizController {


    @Autowired
    QuizService quizService;

    @RequestMapping(value = {"/start", ""})
    public String start(Model model) {

        Integer rand1 = quizService.getRandomNumber();
        Integer rand2 = quizService.getRandomNumber();
        model.addAttribute("rand1",rand1);
        model.addAttribute("rand2",rand2);

        return "/quiz/form";
    }

    @RequestMapping(value = "/quiz", method = RequestMethod.POST)
    public String quiz(/*here comes all the post parameters*/) {
        // be sure to put new randoms to session bu placing them to model
        // get the correct answer using:
        // quizService.getMultiplication(rand1, rand2);
        // implement the method, it is not there yet.

        // do other stuff before returning from controller.
        return "/quiz/quiz";
    }

    @RequestMapping("/complete")
    public String complete() {

        return "/quiz/theend";
    }

}
