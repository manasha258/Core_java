package controlstatement;

public class nestedif {
    public static void main(String[] args) {

        int age=15;
        String people="Indian";
        if(age>18)
        {
            System.out.println("Age is valid");
            if(people.equals("Indian"))
            {
                  System.out.println("Eligible to vote");
            }
            else {
                System.out.println("Not eligible to vote");
            }
        }
        else
        {
            System.out.println("Age is not valid");
        }

    }
}

