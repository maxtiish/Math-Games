package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static String getTask() {
        return "What number is missing in the progression?";
    }
    public static String[][] getQuestions() {
        String[][] questions = new String[Engine.getCount()][2];

        final int progressionLength = 10;

        for (var i = 0; i < Engine.getCount(); i++) {
            var firstNum = Utils.getRandomNumToTwenty();
            var algorithm = "";
            var difference = Utils.getRandomNumToTen();

            for (var count = 0; count < progressionLength; count++) {
                var nextNum = firstNum + difference;
                algorithm += Integer.toString(nextNum) + " ";
                firstNum = nextNum;
            }
            var numbers = algorithm.split(" ");
            var hiddenNum = Utils.getRandomNumToTen() - 1;

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
