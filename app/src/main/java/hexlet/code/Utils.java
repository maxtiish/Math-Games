package hexlet.code;

import java.util.Random;

public class Utils {
    public static final int FROM = 1;
    public static final int HUNDRED = 100;
    public static final int THOUSAND = 1000;
    public static final int TWENTY = 20;
    public static final int TEN = 10;
    public static int getRandomNumToHundred() {
        final Random random = new Random();
        var number = random.nextInt(FROM, HUNDRED);
        return number;
    }

    public static int getRandomNumToThousand() {
        final Random random = new Random();
        var number = random.nextInt(FROM, THOUSAND);
        return number;
    }

    public static int getRandomNumToTwenty() {
        final Random random = new Random();
        var number = random.nextInt(FROM, TWENTY);
        return number;
    }

    public static int getRandomNumToTen() {
        final Random random = new Random();
        var number = random.nextInt(FROM, TEN);
        return number;
    }

}
