package hexlet.code;

import java.util.Random;

public class Utils {
    public static int getRandomNumber(int bound) {
        final Random random = new Random();
        var number = random.nextInt(bound);
        return number;
    }

    public static int getRandomNumberFrom(int from, int to) {
        final Random random = new Random();
        var number = random.nextInt(from, to);
        return number;

    }
}
