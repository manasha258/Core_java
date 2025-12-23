package array;
import java.util.Arrays;
import java.util.Scanner;

public class CRUD {
    public static void main(String[] args) {
        String[] names= new String[4];
        int count=0;
        Scanner scan=new Scanner(System.in);
        names[0]="hello";
        names[1]="good";
        names[2]="night";
        names[3]="morning";
        System.out.println("before changed:"+Arrays.toString(names));
        System.out.println("tell us index value:");
        int index=scan.nextInt();
        System.out.println("Enter value:");
        String value=scan.next();
        System.out.println("After changed:"+Arrays.toString(names));
        names[index]=value;
    }
}
