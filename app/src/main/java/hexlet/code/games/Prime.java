package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void prime() {
        var task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        int numOfTasks = 3;

        String[][] questions = new String[numOfTasks][2];


        for (var count = 0; count < questions.length; count++) {
            int from = 1;
            int to = 100;
            var num = from + (int) (Math.random() * to);
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
