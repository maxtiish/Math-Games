package hexlet.code;

import java.util.Random;
import java.util.Scanner;
public class Game {
    public static void isEven() {
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String userName = scanner1.next();
        System.out.println("Hello, " + userName + "!");

        final Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        var i = 0;

        while (i < 3) {
            var randomNum = random.nextInt(1000);
            System.out.println("Question: " + randomNum);
            System.out.print("Your choice: ");
            String answer = scanner.next();

            if (randomNum % 2 == 0 && answer.equals("yes")) {
                System.out.println("Correct!");
                i++;
            } else if (randomNum % 2 == 0 && !answer.equals("yes")) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }

            if (randomNum % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!");
                i++;
            } else if (randomNum % 2 != 0 && !answer.equals("no")) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
        if (i == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
