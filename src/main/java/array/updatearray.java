package array;
import java.util.Scanner;
import java.util.Arrays;

public class updatearray {
    public static void main(String[] args) {
        String places[]={"ooty","yercaud","hills","mountain"};
        Scanner sc=new Scanner(System.in);
        System.out.println("Before changed:"+Arrays.toString(places));
        System.out.println("index value:");
        int index =sc.nextInt();
        System.out.println("new value insert:");
        String name=sc.next();
        places[index]=name;
        System.out.println("After changed value:"+Arrays.toString(places));


    }
}
