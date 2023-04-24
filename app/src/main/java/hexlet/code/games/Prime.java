package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    public static void prime() {
        var task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questions = new String[3][2];

        var bound = 200;

        for (var count = 0; count < questions.length; count++) {
            final Random random = new Random();
            var num = random.nextInt(bound);
            questions[count][0] = Integer.toString(num);
            questions[count][1] = "yes";

            for (var i = 2; i < num; i++) {
                if (num % i == 0) {
                    questions[count][1] = "no";
                    break;
                }
            }
        }
        Engine.engine(task, questions);
    }
}
