package hexlet.code;

import java.util.Random;

public class Utils {
    public static final int from = 1;
    public static final int toHundred = 100;
    public static final int toThousand = 1000;
    public static final int toTwenty = 20;
    public static final int toTen = 10;
    public static int getRandomNumToHundred() {
        final Random random = new Random();
        var number = random.nextInt(from, toHundred);
        return number;
    }

    public static int getRandomNumToThousand() {
        final Random random = new Random();
        var number = random.nextInt(from, toThousand);
        return number;
    }

    public static int getRandomNumToTwenty() {
        final Random random = new Random();
        var number = random.nextInt(from, toTwenty);
        return number;
    }

    public static int getRandomNumToTen() {
        final Random random = new Random();
        var number = random.nextInt(from, toTen);
        return number;
    }

}
