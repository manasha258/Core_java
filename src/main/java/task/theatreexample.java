package task;
import java.util.Scanner;

public class theatreexample {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int seats=50;
        System.out.println("Enter number of seats you needed:");
        int need = scan.nextInt();
        int booked=0;
        for(int i=0;i<50;i+=2){
            seats =1;
            booked++;
            System.out.println("Seats"+(i+1));
            if(booked==need){
                break;
            }
        }
        System.out.println("All seats are booked");
    }
}
