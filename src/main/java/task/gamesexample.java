package task;
import java.util.Scanner;

public class gamesexample {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int age = 90;
        int drygames = 70;
        int watergames =50;
        System.out.println("Enter your age here:");
        int num=scan.nextInt();
        if (drygames <= 70) {
            System.out.println("You are ready to ride!");
        } else if (age > 50) {
            System.out.println("You are allow to play all games");
        } else if (age < 30) {
            System.out.println("You are allow only dry games");
        }else if(drygames<=50){
            System.out.println("You are eligible to ride water games!");
        }else if(drygames>50) {
            System.out.println("You are not allow");
        }
        else {
            System.out.println("you are not allow to ride");
        }
    }
}
