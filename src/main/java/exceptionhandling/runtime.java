package exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class runtime {
    public static void main(String[] args) {
        try{
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter one value:");
            String one= scan.nextLine();
            System.out.println("Enter second value:");
            String second=scan.nextLine();
            System.out.println(one+second);
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println(e);

        }
        catch(InputMismatchException ie){
            System.out.println(ie);
            try{
                Scanner scan=new Scanner(System.in);
                System.out.println("Enter a value :");
                String a =scan.next();
                System.out.println("Enter b value:");
                String b = scan.next();
                System.out.println(a+b);
            }
            catch(StringIndexOutOfBoundsException e){
                System.out.println(e);

            }
            finally {
                System.out.println("Thank you");
            }

        }
    }
}
