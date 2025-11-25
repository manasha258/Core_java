package task;

public class stringmethods {
    public static void main(String[] args) {
        String place = "yercaud";
        String location = new String("yercaud");
        System.out.println("place:" + place);
        System.out.println("Location:" + location);
        char Area[] = {'s', 'a', 'l', 'e', 'm'};
        System.out.println("Area:" + Area);
        String company="Amazon";
        System.out.println("Company Name:"+company.charAt(4));
        String Word1="Very";
        String Word2="Good";
        System.out.println("Concat word:"+Word1.concat(Word2));
        System.out.println(Word1+Word2);
        String Marks="Eighty";
        String Marks1="Seventy";
        String Marks2="Eighty";
        System.out.println(Marks.equals(Marks1));
        System.out.println(Marks2.equalsIgnoreCase(Marks1));
        System.out.println(Marks1.toUpperCase());
        System.out.println(Marks.toLowerCase());
        String Book="jancy";
        System.out.println(Book.startsWith("j"));
        System.out.println(Book.endsWith("a"));
        System.out.println(Book.substring(1,3));
        String Proverb="Tit for Tut";
        String proverb1=(Proverb.replace("Tut","Tat"));
        System.out.println("Proverb:"+proverb1);
    }
}
