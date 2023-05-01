package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int FROM = 1;
    public static final int TO = 100;

    public static boolean isPrime(int number) {
        for (var i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static String[][] getQuestions() {
        String[][] questions = new String[Engine.COUNT][2];

        for (var count = 0; count < Engine.COUNT; count++) {
            var num = Utils.getRandomNumberFrom(FROM, TO);
            questions[count][0] = Integer.toString(num);
            questions[count][1] = isPrime(num) ? "yes" : "no";
        }
        return questions;
    }
    public static void runPrime() {
        Engine.runEngine(TASK, getQuestions());
    }
}
