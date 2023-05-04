package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Arrays;

public class Progression {
    public static final String TASK = "What number is missing in the progression?";
    public static final int FROM = 1;
    public static final int TO = 10;
    public static final int BOUND = 20;
    public static final int PROGRESSIONS_LENGTH = 10;

    public static int[] makeProgression(int firstNum, int difference, int length) {
        var progression = new int[length];

        for (var i = 0; i < length; i++) {
            progression[i] = firstNum + i * difference;
        }
        return progression;
    }

    public static String[][] getQuestions() {
        String[][] questions = new String[Engine.COUNT][2];

        for (var i = 0; i < Engine.COUNT; i++) {
            var firstNum = Utils.getRandomNumber(BOUND);
            var difference = Utils.getRandomNumberFrom(FROM, TO);

            var progression = makeProgression(firstNum, difference, PROGRESSIONS_LENGTH);

            var hiddenNumber = Utils.getRandomNumber(progression.length - 1);
            questions[i][1] = String.valueOf(progression[hiddenNumber]);

            var stringProgression = new String[progression.length];
            for (var j = 0; j < progression.length; j++) {
                stringProgression[j] = String.valueOf(progression[j]);
                if (j == hiddenNumber) {
                    stringProgression[j] = "..";
                }
            }
            questions[i][0] = Arrays.toString(stringProgression).
                    replaceAll("\\[|]", "")
                    .replaceAll(",", "");
        }
        return questions;
    }

    public static void runProgression() {
        Engine.runEngine(TASK, getQuestions());
    }
}
