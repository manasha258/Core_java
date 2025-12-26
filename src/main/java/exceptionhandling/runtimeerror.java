package exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class runtimeerror {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter one value:");
            int one = scan.nextInt();
            System.out.println("Enter second value:");
            int second = scan.nextInt();
            System.out.println(one + second);
        } catch (ArithmeticException e) {
            System.out.println(e);

        } catch (InputMismatchException ie) {
            System.out.println(ie);
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter a value:");
                int a = scan.nextInt();
                System.out.println("Enter b value:");
                int b = scan.nextInt();

            } catch (ArithmeticException e) {
                System.out.println(e);

            } finally {
                System.out.println("Thank you");
            }
        }
    }
}
