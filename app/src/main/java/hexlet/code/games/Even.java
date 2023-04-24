package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;

public class Even {
    public static void even() {
        var task = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questions = new String[3][2];

        var i = 0;
        var bound = 1000;

        while (i < questions.length) {
            final Random random = new Random();
            var num = random.nextInt(bound);
            questions[i][0] = Integer.toString(num);
            if (num % 2 == 0) {
                questions[i][1] = "yes";
                i++;
            } else {
                questions[i][1] = "no";
                i++;
            }
        }
        Engine.engine(task, questions);
    }
}

