package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static String getTask() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static String[][] getQuestions() {
        String[][] questions = new String[Engine.getCount()][2];

        for (var i = 0; i < Engine.getCount(); i++) {
            var num = Utils.getRandomNumToThousand();
            questions[i][0] = Integer.toString(num);
            if (num % 2 == 0) {
                questions[i][1] = "yes";
            } else {
                questions[i][1] = "no";
            }
        }
        return questions;
    }

    public static void runEven() {
        Engine.runEngine(getTask(), getQuestions());
    }
}

