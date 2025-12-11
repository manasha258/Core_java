package multipleinheritance;

public class maininterface  implements  interfaceone,interfacetwo{
    @Override
    public void person() {
        System.out.println("manasha");

    }

    @Override
    public void student() {
        System.out.println("ramya");

    }

    public static void main(String[] args) {
        maininterface ss=new maininterface();
        ss.person();
        ss.student();

    }
}
