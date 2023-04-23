package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static void calc() {
        var task = "What is the result of the expression?";

        String[][] questions = new String[3][2];

        var i = 0;

        var sum = 0;

        while (i < 3) {
            final Random random = new Random();
            char[] operations = {'+', '-', '*'};
            var randomOperation = random.nextInt(3);
            var randomNum = random.nextInt(1, 15);
            var secondRandomNum = random.nextInt(1, 15);
            var text = Integer.toString(randomNum) + operations[randomOperation] + Integer.toString(secondRandomNum);
            questions[i][0] = text;
            switch (randomOperation) {
                case 0:
                    sum = randomNum + secondRandomNum;
                    questions[i][1] = Integer.toString(sum);
                    i++;
                    break;
                case 1:
                    sum = randomNum - secondRandomNum;
                    questions[i][1] = Integer.toString(sum);
                    i++;
                    break;
                case 2:
                    sum = randomNum * secondRandomNum;
                    questions[i][1] = Integer.toString(sum);
                    i++;
                    break;
                default:
                    sum = 0;
            }
        }
        Engine.engine(task, questions);
    }
}
