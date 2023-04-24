package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    public static void progression() {
        var task = "What number is missing in the progression?";

        final int numberOfTasks = 3;
        String[][] questions = new String[numberOfTasks][2];

        var i = 0;

        final int boundForNum = 20;
        final int boundForDifference = 10;

        while (i < questions.length) {
            final Random random = new Random();
            var firstNum = random.nextInt(boundForNum);
            var algorithm = "";
            var difference = random.nextInt(boundForDifference);

            for (var count = 0; count < boundForDifference; count++) {
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
            i++;
        }
        Engine.engine(task, questions);
    }
}
