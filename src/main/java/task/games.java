package task;

public class games {
    public static void main(String[] args) {
        int age = 90;
        int weight = 60;
        if (age>30 && age <110) {
            System.out.println("You are allow to ride all games!");
            if (weight <= 60) {
                System.out.println("You are allow to ride!");
            } else {
                System.out.println("You are not allow to ride");
            }
        } else {
            System.out.println("you are not allow ");

        }
    }
}