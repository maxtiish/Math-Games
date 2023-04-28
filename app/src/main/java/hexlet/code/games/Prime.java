package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void runPrime() {
        var task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[][] questions = new String[Engine.getCount()][2];

        final int from = 1;
        final int to = 100;

        for (var count = 0; count < Engine.getCount(); count++) {
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
        Engine.runEngine(task, questions);
    }
}
