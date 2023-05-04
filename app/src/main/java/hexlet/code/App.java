package hexlet.code;

import hexlet.code.games.Gcd;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;
public class App {
    static final int GREET_NUM = 1;
    static final int EVEN_NUM = 2;
    static final int CALC_NUM = 3;
    static final int GCD_NUM = 4;
    static final int PROGRESSION_NUM = 5;
    static final int PRIME_NUM = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");

        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case GREET_NUM -> Cli.greeting();
            case EVEN_NUM -> Even.runEven();
            case CALC_NUM -> Calc.runCalc();
            case GCD_NUM -> Gcd.runGcd();
            case PROGRESSION_NUM -> Progression.runProgression();
            case PRIME_NUM -> Prime.runPrime();
            case 0 -> System.out.println("Goodbye!");
            default -> throw new RuntimeException("Unexpected answer: " + choice);
        }
        scanner.close();
    }
}
