package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.math.BigInteger;

public class Gcd {
    public static void runGcd() {
        var task = "Find the greatest common divisor of given numbers.";

        String[][] questions = new String[Engine.getCount()][2];

        final int boundTo = 100;
        final int boundFrom = 1;

        for (var i = 0; i < Engine.getCount(); i++) {
            BigInteger result;
            final Random random = new Random();
            var firstRandomNum = random.nextInt(boundFrom, boundTo);
            var secondRandomNum = random.nextInt(boundFrom, boundTo);

            String firstNum = Integer.toString(firstRandomNum);
            String secondNum = Integer.toString(secondRandomNum);
            BigInteger a = new BigInteger(firstNum);
            BigInteger b = new BigInteger(secondNum);
            result = a.gcd(b);

            questions[i][1] = result.toString();
            questions[i][0] = firstNum + " " + secondNum;
        }
        Engine.runEngine(task, questions);
    }
}
