package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Calc {
    public static String getTask() {
        return "What is the result of the expression?";
    }

    public static String[][] getQuestions() {
        String[][] questions = new String[Engine.getCount()][2];

        char[] operations = {'+', '-', '*'};

        var result = 0;

        for (var i = 0; i < Engine.getCount(); i++) {
            final Random random = new Random();
            var randomOperation = random.nextInt(operations.length);
            var randomNum = Utils.getRandomNumToTwenty();
            var secondRandomNum = Utils.getRandomNumToTwenty();

            var text = Integer.toString(randomNum) + " " + operations[randomOperation] + " " + (secondRandomNum);
            questions[i][0] = text;

            if (randomOperation == 0) {
                result = randomNum + secondRandomNum;
            } else if (randomOperation == 1) {
                result = randomNum - secondRandomNum;
            } else {
                result = randomNum * secondRandomNum;
            }
            questions[i][1] = Integer.toString(result);
        }
        return questions;
    }
    public static void runCalc() {
        Engine.runEngine(getTask(), getQuestions());
    }
}
