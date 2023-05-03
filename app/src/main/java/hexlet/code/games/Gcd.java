package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Gcd {
    public static final String TASK = "Find the greatest common divisor of given numbers.";
    public static final int FROM = 1;
    public static final int TO = 100;

    public static String gcd(int firstNum, int secondNum) {
        var commonDivisor = 0;
        var min = Math.min(firstNum, secondNum);
        for (var i = 1; i <= min; i++) {
            if (firstNum % i == 0 && secondNum % i == 0) {
                commonDivisor = i;
            }
        }
        return Integer.toString(commonDivisor);
    }

    public static String[][] getQuestions() {
        String[][] questions = new String[Engine.COUNT][2];

        for (var i = 0; i < Engine.COUNT; i++) {
            var firstRandomNum = Utils.getRandomNumberFrom(FROM, TO);
            var secondRandomNum = Utils.getRandomNumberFrom(FROM, TO);

            String firstNum = Integer.toString(firstRandomNum);
            String secondNum = Integer.toString(secondRandomNum);

            questions[i][0] = firstNum + " " + secondNum;
            questions[i][1] = gcd(firstRandomNum, secondRandomNum);
        }
        return questions;
    }

    public static void runGcd() {
        Engine.runEngine(TASK, getQuestions());
    }
}
