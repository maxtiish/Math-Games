package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static void runCalc() {
        var task = "What is the result of the expression?";

        String[][] questions = new String[Engine.getCount()][2];

        char[] operations = {'+', '-', '*'};

        final int boundForNum = 15;

        var result = 0;

        for (var i = 0; i < Engine.getCount(); i++) {
            final Random random = new Random();
            var randomOperation = random.nextInt(questions.length);
            var randomNum = random.nextInt(boundForNum);
            var secondRandomNum = random.nextInt(boundForNum);
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
        Engine.runEngine(task, questions);
    }
}
