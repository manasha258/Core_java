package exceptionhandling;
import java.util.Scanner;

public class chances {
    static Scanner scan = new Scanner(System.in);

    public static void unlimit(String text) {
        try {
            System.out.println("Tell us text starting string name:");
            int start = scan.nextInt();
            System.out.println("Tell us text ending string name:");
            int end = scan.nextInt();
            System.out.println("content of string:" + text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("total string length:" + text.length() + "text inbetween words");
            unlimit(text);

        }
    }

    public static void limit(String text1, int chance) {
        try {
            System.out.println("Tell us text starting string name:");
            int start = scan.nextInt();
            System.out.println("Tell us text ending string name:");
            int end = scan.nextInt();
            System.out.println("content of string:" + text1.substring(start,end));

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("total string length:" + text1.length() + "text inbetween words");
            if (chance < 4) {
                chance++;
                limit(text1, chance);
            } else {
                System.out.println("chance over");
            }

        }
    }

    public static void main(String[] args) {
        String data = "happiness overloaded";
        limit(data, 1);
    }
}
