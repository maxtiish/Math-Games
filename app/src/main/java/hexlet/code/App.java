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
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        int num = scanner.nextInt();

        switch (num) {
            case 1 -> Cli.greeting();
            case 2 -> Even.even();
            case 3 -> Calc.calc();
            case 4 -> Gcd.gcd();
            case 5 -> Progression.progression();
            case 6 -> Prime.prime();
            default -> {
            }
        }
        scanner.close();
    }
}
