
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */


public class DivisionException {

    static int x = 20;
    static int y;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter an integer:");
            y = scanner.nextInt();
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero is not allowed.");
        }
    }
}