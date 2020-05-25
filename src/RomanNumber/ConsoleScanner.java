package RomanNumber;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleScanner {
    public int nextNumber() {
        System.out.print("Please put the number to convert to roman numerals : ");
        final Scanner input = new Scanner(System.in);
        try {
            return input.nextInt();

        } catch (final InputMismatchException e) {
            System.out.println("Please input int");
            return nextNumber();
        }
    }
}
