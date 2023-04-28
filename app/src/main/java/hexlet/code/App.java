package hexlet.code;

import hexlet.code.games.Progression;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
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
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        if (choice == GREET_NUM) {
            Cli.greeting();
        } else if (choice == EVEN_NUM) {
            Even.runEven();
        } else if (choice == CALC_NUM) {
            Calc.runCalc();
        } else if (choice == GCD_NUM) {
            Gcd.runGcd();
        } else if (choice == PROGRESSION_NUM) {
            Progression.runProgression();
        } else if (choice == PRIME_NUM) {
            Prime.runPrime();
        }
        scanner.close();
    }
}
