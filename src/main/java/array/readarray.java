package array;
import java.util.Arrays;
import java.util.Scanner;

public class readarray {
    public static void main(String[] args) {
        String names[]={"milkybar","dairy","dark","straberry","chocolate"};
        Scanner ss=new Scanner(System.in);
        System.out.println("Tell me ur favourite:");
        String names1= ss.next();
        for(int i=0;i<names.length;i++){
            if(names1.equalsIgnoreCase(names[i])){
                System.out.println("value is:"+names);
                return;
            }
        }
        System.out.println("not valid");
    }
}
