package task;

public class variables {
    static  int num =20;
    float number=5.6f;
    public void Access(){
        String name="manasha";
        System.out.println("My float value is:" +number);
        System.out.println("My name is:" +name);
        System.out.println("My value is:" +num);

    }
    public static void main(String[] args) {
        int age=21;
        System.out.println("My age is:"+age);
        variables vv=new variables();
        vv.Access();

    }
}
