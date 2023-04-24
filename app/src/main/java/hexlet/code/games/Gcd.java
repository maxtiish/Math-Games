package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.math.BigInteger;

public class Gcd {
    public static void gcd() {
        var task = "Find the greatest common divisor of given numbers.";

        String[][] questions = new String[3][2];

        var i = 0;

        while (i < 3) {
            BigInteger result;
            final Random random = new Random();
            var firstRandomNum = random.nextInt(100);
            var secondRandomNum = random.nextInt(100);

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
