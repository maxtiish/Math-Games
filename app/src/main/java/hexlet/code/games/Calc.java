package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static void calc() {
        var task = "What is the result of the expression?";
        String[][] questions = new String[3][2];

        char[] operations = {'+', '-', '*'};
        var result = 0;
        var boundForNums = 15;

        for (var i = 0; i < questions.length; i++) {
            final Random random = new Random();
            var randomOperation = random.nextInt(questions.length);
            var randomNum = random.nextInt(boundForNums);
            var secondRandomNum = random.nextInt(boundForNums);
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
        Engine.engine(task, questions);
    }
}
