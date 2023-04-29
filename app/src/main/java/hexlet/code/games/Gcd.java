package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.math.BigInteger;

public class Gcd {
    public static String getTask() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static String[][] getQuestions() {
        String[][] questions = new String[Engine.getCount()][2];

        for (var i = 0; i < Engine.getCount(); i++) {
            var firstRandomNum = Utils.getRandomNumToHundred();
            var secondRandomNum = Utils.getRandomNumToHundred();

            String firstNum = Integer.toString(firstRandomNum);
            String secondNum = Integer.toString(secondRandomNum);

            BigInteger result;
            BigInteger a = new BigInteger(firstNum);
            BigInteger b = new BigInteger(secondNum);
            result = a.gcd(b);

            questions[i][1] = result.toString();
            questions[i][0] = firstNum + " " + secondNum;
        }
        return questions;
    }

    public static void runGcd() {
        Engine.runEngine(getTask(), getQuestions());
    }
}
