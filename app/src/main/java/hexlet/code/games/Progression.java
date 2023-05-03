package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static final String TASK = "What number is missing in the progression?";
    public static final int FROM = 1;
    public static final int TO = 10;
    public static final int BOUND = 20;
    public static final int PROGRESSIONS_LENGTH = 10;

    public static String[] makeProgression(int firstNum, int difference) {

        var progression = new String[PROGRESSIONS_LENGTH];

        for (var i = 0; i < PROGRESSIONS_LENGTH; i++) {
            progression[i] = String.valueOf(firstNum + i * difference);
        }
        return progression;
    }

    public static String[][] getQuestions() {
        String[][] questions = new String[Engine.COUNT][2];

        for (var i = 0; i < Engine.COUNT; i++) {
            var firstNum = Utils.getRandomNumber(BOUND);
            var difference = Utils.getRandomNumberFrom(FROM, TO);

            var progression = makeProgression(firstNum, difference);
            var hiddenNum = Utils.getRandomNumberFrom(1, progression.length - 1);
            questions[i][1] = progression[hiddenNum];
            progression[hiddenNum] = "..";

            questions[i][0] = String.join(" ", progression);

        }
        return questions;
    }

    public static void runProgression() {
        Engine.runEngine(TASK, getQuestions());
    }
}
