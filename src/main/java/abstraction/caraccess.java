package abstraction;
abstract class car{
    public abstract void acclerator();//dummy method
    public abstract void steering();
    public void audi(){
        System.out.println("Its a car");
    }
}
public class caraccess extends car {

    public static void main(String[] args) {
        car cc = new caraccess(); //upcasting
        cc.acclerator();
        cc.steering();
        cc.audi();
    }

    @Override
    public void acclerator() {
        System.out.println("accelerator");
    }

    @Override
    public void steering() {
        System.out.println("Steering");
    }
}
