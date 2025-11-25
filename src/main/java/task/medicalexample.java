package task;
import java.util.Scanner;
public class medicalexample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int paracetamal = 20;
        int dark = 25;
        int saridon = 10;
        String choice;
        do {
            System.out.println("Enter your Medicine Name (paracetamal/dark/saridon):");
            String enter = scan.nextLine();
            System.out.println("How much you needed:");
            int need = scan.nextInt();
            scan.nextLine();
            switch (enter) {
                case "paracetamal":
                    if (need <= paracetamal) {
                        System.out.println("We have a stock to provide.");
                    } else {
                        System.out.println("Sorry, we don't have enough stock.");
                    }
                    break;
                case "dark":
                    if (need <= dark) {
                        System.out.println("We will provide.");
                    } else {
                        System.out.println("Out of stock.");
                    }
                    break;
                case "saridon":
                    if (need <= saridon) {
                        System.out.println("We will provide.");
                    } else {
                        System.out.println("There is no stock.");
                    }
                    break;
                default:
                    System.out.println("Thank you for coming to visit our store.");
            }
            System.out.println("Do you like this shop?");
            choice= scan.nextLine();

                } while (choice.equals("yes"));
        System.out.println("Thank you!");
                scan.close();
            }
        }
