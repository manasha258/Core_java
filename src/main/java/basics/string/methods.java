package basics.string;

import java.util.Locale;

public class methods {
    public static void main(String[] args) {
        //literal
        String name="Manasha";
        //Non literal
        String Name=new String("Manasha");
        System.out.println("String data"+name);
        System.out.println("String value"+name);
        char location[]={'s','a','l','e','m'};
        System.out.println("location"+location);
        //charAt
        String college="Vinayak Mission";
        System.out.println("College Name"+college.charAt(4));
        //concat
        String food="pizza";
        String Food="Burger";
        System.out.println("Concat:"+food.concat(Food));
        System.out.println(food+Food);
        //equals
        String bus="ramani";
        String bus1="Ramani";
        String bus2="ramani";
        System.out.println(bus.equals(bus1));
        System.out.println(bus1.equalsIgnoreCase(bus2));
        //uppercase
        System.out.println(bus1.toUpperCase());
        //lowercase
        System.out.println(bus.toUpperCase());
        //startwith
        String place="Salem";
        System.out.println("place name:"+place.startsWith("S"));
        //endswith
        System.out.println("place name:"+place.endsWith("t"));
        //substring
        System.out.println("place name:"+place.substring(1,4));
        //replace
        String sentence="Health is good";
        String sentence1=sentence.replace("good","Wealth");
        System.out.println("Replace String:"+sentence1);
    }
}
