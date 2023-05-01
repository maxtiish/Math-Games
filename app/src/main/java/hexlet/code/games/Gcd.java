package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.math.BigInteger;

public class Gcd {
    public static final String TASK = "Find the greatest common divisor of given numbers.";
    public static final int FROM = 1;
    public static final int TO = 100;

    public static String gcd(int firstNum, int secondNum) {
        BigInteger result;
        BigInteger a = new BigInteger(Integer.toString(firstNum));
        BigInteger b = new BigInteger(Integer.toString(secondNum));
        result = a.gcd(b);
        return result.toString();
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
