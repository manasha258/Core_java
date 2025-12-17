package polymorphism;

public class overloading {
    public void add(int a, int b) {
        if (a == b) {
            System.out.println("both are same");
        } else {
            System.out.println("not equal");
        }
    }
    public void add(String name,String name1) {
        if(name.equalsIgnoreCase(name1)){
            System.out.println("equal");
        }
    }

    public static void main(String[] args) {
        overloading oo =new overloading();
        oo.add(12,30);
        oo.add("manoj","Manoj");
    }

}
