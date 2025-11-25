package task;
import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pin = 12345;
        int balance = 20000;
        System.out.println("Enter your pin number:");
        int enterpin = scan.nextInt();
        if(enterpin !=pin)
        {
            System.out.println("Incorrect pin");
        }else{
            System.out.println("login successfully");
        }
        System.out.println("____Available choices____");
        System.out.println("1.check balance");
        System.out.println("2.deposit");
        System.out.println("3,withdraw");
        System.out.println("4.exit");
        System.out.println("Enter your choice here:");
        int num= scan.nextInt();
        switch(num)
        {
            case 1:
                if(balance>=0)
                {
                    System.out.println("Available balance:" +balance);
                }else{
                    System.out.println("Not Available balance");
                }
                break;
            case 2:
                System.out.println("Enter your deposit amount");
                int deposit= scan.nextInt();
                if(deposit >0)
                {
                    balance+=deposit;
                    System.out.println("Deposit successfully:"+balance);
                    System.out.println("Updated balance:"+balance);
                }else{
                    System.out.println("Invalid deposit");
                }
                break;
            case 3:
                System.out.println("Enter your withdraw amount:");
                int withdraw = scan.nextInt();
                if(withdraw<0)
                {
                    System.out.println("Withdraw not work");
                } else if(withdraw>balance)
            {
                System.out.println("invalid withdrawal");
               }
                else{
                    balance-=withdraw;
                    System.out.println("Withdrawal successfully:"+withdraw);
                    System.out.println("updated balance:"+balance);
                }
                break;
            case 4:
                System.out.println("Thankyou");
                break;
            default:
                System.out.println("Invalid option");


        }
}
}
