package task;

public class maininterface implements interfaceone,interfacetwo {



        @Override
        public void students () {
            System.out.println("manasha");
            System.out.println("ramya");
            System.out.println("yaso");
        }

        @Override
        public void teacher () {
            System.out.println("pavithra");

        }

    public static void main(String[] args) {
        maininterface mm=new maininterface();
        mm.students();
        mm.teacher();

    }
}

