package inheritance;
class a{
    String name;
    void display(){
        System.out.println("name is:"+name);
    }
}
class b extends a{
    int age;
    void result(){
        System.out.println("age is:"+age);
    }
}
class c extends a{
    String college;
    void output(){
        System.out.println("College is:"+college);
    }
}
class d extends b{
    String place;
    int experience;
    void solution(){
        System.out.println("Place is:"+place);
        System.out.println("Experience is:"+experience);
    }
}

public class hybrid {
    public static void main(String[] args) {
        c obj =new c();
        d ss=new d();
        obj.name="Ram";
        obj.college="vmkv";
        ss.place="salem";
        ss.age=20;
        ss.experience=10;
        obj.display();
        ss.result();
        obj.output();
        ss.solution();

    }
}
