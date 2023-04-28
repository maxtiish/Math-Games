package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    public static String getTask() {
        return "What number is missing in the progression?";
    }
    public static String[][] getQuestions() {
        String[][] questions = new String[Engine.getCount()][2];

        final int boundForNum = 20;
        final int boundTo = 10;
        final int boundFrom = 1;

        for (var i = 0; i < Engine.getCount(); i++) {
            final Random random = new Random();
            var firstNum = random.nextInt(boundForNum);
            var algorithm = "";
            var difference = random.nextInt(boundFrom, boundTo);

            for (var count = 0; count < boundTo; count++) {
                var nextNum = firstNum + difference;
                algorithm += Integer.toString(nextNum) + " ";
                firstNum = nextNum;
            }
            var numbers = algorithm.split(" ");
            var boundForHiddenNum = numbers.length - 1;
            var hiddenNum = random.nextInt(boundForHiddenNum);
            questions[i][1] = numbers[hiddenNum];
            numbers[hiddenNum] = "..";
            questions[i][0] = String.join(" ", numbers);
        }
        return questions;
    }

    public static void runProgression() {
        Engine.runEngine(getTask(), getQuestions());
    }
}
