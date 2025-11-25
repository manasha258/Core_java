package task;

import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value for alpha:");
        int num1 = scan.nextInt();
        System.out.println("Enter the operator:");
        char op = scan.next().charAt(0);
        System.out.println("Enter value for beta:0");
        int num2 = scan.nextInt();
        int result = 0;
        if (op == '+') {
            result = num1 + num2;
        } else if (op == '-') {
            result = num1 - num2;
        } else if (op == '*') {
            result = num1 * num2;
        } else if (op == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("error message");
                scan.close();
                return;
            }
        } else {
            System.out.println("invalid operator");
            scan.close();
            return;
        }

            System.out.println("result:" +result);
            scan.close();
        }
}





