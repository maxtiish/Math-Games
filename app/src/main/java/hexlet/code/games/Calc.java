package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final String TASK = "What is the result of the expression?";
    public static final int FROM = 1;
    public static final int TO = 20;

    public static int calculate(int firstNum, int secondNum, char operation) {
        var result = 0;

        if (operation == '+') {
            result = firstNum + secondNum;
        } else if (operation == '-') {
            result = firstNum - secondNum;
        } else {
            result = firstNum * secondNum;
        }
        return result;
    }
    public static String[][] getQuestions() {
        String[][] questions = new String[Engine.COUNT][2];

        char[] operations = {'+', '-', '*'};

        for (var i = 0; i < Engine.COUNT; i++) {
            var randomIndex = Utils.getRandomNumber(operations.length - 1);
            var operation = operations[randomIndex];

            var randomNum = Utils.getRandomNumberFrom(1, 20);
            var secondRandomNum = Utils.getRandomNumberFrom(1, 20);

            var text = Integer.toString(randomNum) + " " + operation + " " + (secondRandomNum);
            questions[i][0] = text;

            questions[i][1] = Integer.toString(calculate(randomNum, secondRandomNum, operation));
        }
        return questions;
    }
    public static void runCalc() {
        Engine.runEngine(TASK, getQuestions());
    }
}
