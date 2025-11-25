package task;

public class controlstatements {
    public static void main(String[] args) {
        int percentage=85;
        int CGPA=8;
        if(percentage>=85) {
            System.out.println("You are Eligible for 'A' grade Training");
            if (CGPA >= 8) {
                System.out.println("You are Eligible for Placements");
            } else {
                System.out.println("You are not Eligible");
            }
        }else{
            System.out.println("You are Eligible for 'B' and 'C' grade training");
        }
    }
}
