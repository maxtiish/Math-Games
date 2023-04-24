package hexlet.code;

import hexlet.code.games.Progression;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import java.util.Scanner;
public class App {
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
        int num = scanner.nextInt();

        if (num == 1) {
            Cli.greeting();
        } else if (num == 2) {
            Even.even();
        } else if (num == 3) {
            Calc.calc();
        } else if (num == 4) {
            Gcd.gcd();
        } else if (num == 5) {
            Progression.progression();
        } else if (num == 6) {
            Prime.prime();
        }
        scanner.close();
    }
}
