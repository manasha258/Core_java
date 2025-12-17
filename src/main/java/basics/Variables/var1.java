package basics.Variables;


public class var1 {
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
        var1 vv= new var1();
        vv.Access();

    }
}
