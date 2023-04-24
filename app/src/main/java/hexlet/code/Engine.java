package hexlet.code;

import java.util.Scanner;

public final class Engine {
    public static void engine(String task, String[][] questions) {
        Scanner name = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String userName = name.next();
        System.out.println("Hello, " + userName + "!");

        Scanner scanner = new Scanner(System.in);
        System.out.println(task);

        var i = 0;

        for (i = 0; i < questions.length; i++) {
            System.out.println("Question: " + questions[i][0]);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (answer.equals(questions[i][1]))  {
                System.out.println("Correct!");
            } else {
                var text = "'" + answer + "' is wrong answer ;(. Correct answer was '" + questions[i][1] + "'.";
                System.out.println(text);
                System.out.println("Let's try again, " + userName + "!");
                break;
            }

        }

        if (i == questions.length) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
