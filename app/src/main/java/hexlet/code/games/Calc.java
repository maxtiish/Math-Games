package hexlet.code.games;

import java.util.Scanner;
import java.util.Random;

public class Calc {
    public static void calc() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        final Random random = new Random();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("What is the result of the expression?");

        var i = 0;

        while (i < 3) {
            char[] operations = {'+', '-', '*'};
            var randomOperation = random.nextInt(3);
            var randomNum = random.nextInt(1, 15);
            var secondRandomNum = random.nextInt(1, 15);

            System.out.println("Question: " + randomNum + operations[randomOperation] + secondRandomNum);
            System.out.print("Your answer: ");
            var answer = scanner.nextInt();

            var problem = randomNum + operations[randomOperation] + secondRandomNum;
            var sum = 0;

            switch (randomOperation) {
                case 0:
                    sum = randomNum + secondRandomNum;
                    break;
                case 1:
                    sum = randomNum - secondRandomNum;
                    break;
                case 2:
                    sum = randomNum * secondRandomNum;
                    break;
            }
            if (sum == answer) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + sum + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
        scanner.close();
        if (i == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}