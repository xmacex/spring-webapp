package edu.uta.courses.service.impl;

import edu.uta.courses.service.QuizService;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Created by me on 27.1.2015.
 */
@Service("quizService")
public class QuizServiceImpl implements QuizService {

    @Override
    public Integer getRandomNumber() {
        // http://stackoverflow.com/questions/363681/generating-random-integers-in-a-range-with-java

        Random rand = new Random();
        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt(9) + 1;

        return randomNum;
    }
}
