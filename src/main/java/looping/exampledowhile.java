package looping;

import java.util.Scanner;

public class exampledowhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int student = 0;
        float time;
        int count = 0;
        int totalStudent = 5;
        do {
            System.out.println(student + "student entry time:");
            time = scan.nextFloat();
            if (time > 9.15) {
                System.out.println("You have to pay the fine amount");
                count++;
            } else {
                System.out.println("Go to your respective classes");
            }
            student++;
        } while (student <= totalStudent);
        {
            System.out.println("This month late comer:" + count);
        }
    }
}
