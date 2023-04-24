package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    public static void progression() {
        var task = "What number is missing in the progression?";

        String[][] questions = new String[3][2];

        var i = 0;

        while (i < 3) {
            final Random random = new Random();
            var firstNum = random.nextInt(20);
            var algorithm = "";
            var d = random.nextInt(1, 10);

            for (var count = 0; count < 10; count++) {
                var nextNum = firstNum + d;
                algorithm += Integer.toString(nextNum) + " ";
                firstNum = nextNum;
            }
            var numbers = algorithm.split(" ");
            var hiddenNum = random.nextInt(0, 9);
            questions[i][1] = numbers[hiddenNum];
            numbers[hiddenNum] = "..";
            questions[i][0] = String.join(" ", numbers);
            i++;
        }
        Engine.engine(task, questions);
    }
}
