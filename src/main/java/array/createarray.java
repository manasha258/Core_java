package array;

import java.util.Arrays;
import java.util.Scanner;

public class createarray {
    public static void main(String[] args) {

        //syantax
        //datatype arrayname[]
        //int a[]
        //one method
        int a[] = {10, 20, 30, 40, 50, 60};
        System.out.println(Arrays.toString(a));
        //loop method
        String names[]={"manasha","praba","harini","manu"};
        for(int i=0;i<names.length;i++){
            System.out.println("Arrayvaluses:"+names[i]);
        }
        //for each loop
        //syntax for(variablename:arrayname)
        for(String students:names){
            System.out.println("values:"+students);
        }
        //using scanner class
        char letter[]=new char[5];  //Array declaration
        for(int i=0;i<letter.length;i++){
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter values:");
            char letter1=scan.next().charAt(0);
            letter[i]=letter1;
        }
        System.out.println("values:"+Arrays.toString(letter));
        //scanner example
        String name[]= new String[5];
        for(int i=0;i<name.length;i++){
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter name:");
            String name1=scan.next();
            name[i]=name1;
        }
        System.out.println("values:"+Arrays.toString(name));

    }
}
