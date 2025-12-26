package exceptionhandling;

public class arithmeticexample{
    public static void main(String[] args) {
        try{ //declartion part
            int data=10;
            int data1=0;
            System.out.println(data/data1);

        }
        catch(ArithmeticException e){ //in catch block we have to assign value in sout and not get value from try block
            System.out.println(e);
            System.out.println("value");
        }
    }
}
