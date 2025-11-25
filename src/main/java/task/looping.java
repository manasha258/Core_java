package task;
import java.util.Scanner;

public class looping {
    public static void main(String[] args) {
        int seats=0;
        int totalStrength=50;
        for(int i=0;i<50;i++){
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter your Number of seats you need:");
            seats=scan.nextInt();
        }
    }
}