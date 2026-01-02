package collection;
import java.util.ArrayList;
import java.util.Vector;


public class arraylist {
    public static void main(String[] args) {
            ArrayList al = new ArrayList();
            al.add(1001);
            al.add("Manasha");
            al.add("vmk");
            al.add(5.45454);
            al.add(9.5f);
            // System.out.println("ArrayList:"+al);
            Vector vv= new Vector();
            vv.addAll(al);
            vv.add("Sowmiya");
            vv.add("vmk");
            System.out.println("ArrayList"+al);
            System.out.println("vector values"+vv);
            vv.remove("vmk");
            System.out.println("remove values"+vv);
            vv.removeAll(al);
            System.out.println("Remove Arraylist values in Vector"+vv);

        }
    }

