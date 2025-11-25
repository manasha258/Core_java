package task;

public class methods {
    static  int age=10;
    float num=54.6f;
    public void Access() {
        System.out.println("My value is:"+num);
    }
    public static void main(String[] args) {
        System.out.println("My age is:"+age);
        methods task=new methods();
        task.Access();

    }

}
