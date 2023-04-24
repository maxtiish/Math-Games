package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.math.BigInteger;

public class Gcd {
    public static void gcd() {
        var task = "Find the greatest common divisor of given numbers.";
        String[][] questions = new String[3][2];

        final int bound = 100;

        var i = 0;

        while (i < questions.length) {
            BigInteger result;
            final Random random = new Random();
            var firstRandomNum = random.nextInt(bound);
            var secondRandomNum = random.nextInt(bound);

            String firstNum = Integer.toString(firstRandomNum);
            String secondNum = Integer.toString(secondRandomNum);
            BigInteger a = new BigInteger(firstNum);
            BigInteger b = new BigInteger(secondNum);
            result = a.gcd(b);

            questions[i][1] = result.toString();
            questions[i][0] = firstNum + " " + secondNum;
            i++;
        }
        Engine.engine(task, questions);
    }
}
