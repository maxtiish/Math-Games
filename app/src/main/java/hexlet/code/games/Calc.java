package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final String TASK = "What is the result of the expression?";
    public static final int FROM = 1;
    public static final int TO = 20;

    public static int calculate(int firstNum, int secondNum, char operator) {
        var result = switch (operator) {
            case '+' -> firstNum + secondNum;
            case '-' -> firstNum - secondNum;
            case '*' -> firstNum * secondNum;
            case '/' -> firstNum / secondNum;
            default -> throw new RuntimeException("Invalid operator: " + operator);
        };
        return result;
    }

    public static String[][] getQuestions() {
        String[][] questions = new String[Engine.COUNT][2];

        char[] operations = {'+', '-', '*'};

        for (var i = 0; i < Engine.COUNT; i++) {
            var randomIndex = Utils.getRandomNumber(operations.length - 1);
            var operation = operations[randomIndex];

            var randomNum = Utils.getRandomNumberFrom(FROM, TO);
            var secondRandomNum = Utils.getRandomNumberFrom(FROM, TO);

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
