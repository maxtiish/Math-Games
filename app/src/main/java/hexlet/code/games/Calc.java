package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static void calc() {
        var task = "What is the result of the expression?";
        String[][] questions = new String[3][2];

        char[] operations = {'+', '-', '*'};
        var sum = 0;

        for (var i = 0; i < 3; i++) {
            final Random random = new Random();
            var randomOperation = random.nextInt(3);
            var randomNum = random.nextInt(1, 15);
            var secondRandomNum = random.nextInt(1, 15);
            var text = Integer.toString(randomNum) + operations[randomOperation] + Integer.toString(secondRandomNum);
            questions[i][0] = text;

            if (randomOperation == 0) {
                sum = Math.addExact(randomNum, secondRandomNum);
            } else if (randomOperation == 1) {
                sum = Math.addExact(randomNum, -secondRandomNum);
            } else {
                sum = Math.multiplyExact(randomNum, secondRandomNum);
            }
            questions[i][1] = Integer.toString(sum);
        }
        Engine.engine(task, questions);
    }
}
