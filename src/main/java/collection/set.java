package collection;

import java.util.HashSet;
import java.util.Iterator;

public class set {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        hs.add(1234);
        hs.add(3467);
        hs.add("manasha");
        hs.add("vmkv");
        System.out.println("hashset value:"+hs);
        Iterator it=hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
