package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static final int BOUND = 1000;

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static String[][] getQuestions() {
        String[][] questions = new String[Engine.COUNT][2];

        for (var i = 0; i < Engine.COUNT; i++) {
            var num = Utils.getRandomNumber(1000);
            questions[i][0] = Integer.toString(num);
            questions[i][1] = isEven(num) ? "yes" : "no";
        }
        return questions;
    }

    public static void runEven() {
        Engine.runEngine(TASK, getQuestions());
    }
}

