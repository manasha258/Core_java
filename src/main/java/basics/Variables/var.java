package basics.Variables;

public class var {
    static int age=20;
    float height=5.5f;    //Instance variable
    public  void Access()
    {
        System.out.println("Height is "+height);
        String College ="VIMS";   //Local,variable
        System.out.println("College Name is "+College);
    }
    public static void main(String[] args) {
        System.out.println("Age is :"+age);
        String name ="Manasha";   //global
        System.out.println("My Name is :"+name);


        //We can thecreate the object
        //classname objectname = new classname();
         var vv= new var();
        vv.Access();

    }
}
