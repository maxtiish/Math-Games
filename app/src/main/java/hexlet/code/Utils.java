package hexlet.code;

import java.util.Random;

public class Utils {
    public static int getRandomNumber(int bound) {
        return getRandomNumberFrom(0, bound);
    }

    public static int getRandomNumberFrom(int from, int to) {
        return new Random().nextInt(from, to);

    }
}
