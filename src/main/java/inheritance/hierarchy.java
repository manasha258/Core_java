package inheritance;
class grandpa{
    String name;
    int age;
    void display(){
        System.out.println("My name is:"+name);
        System.out.println("Age is:"+age);
    }
}
class son extends grandpa{
    String work;
    int experience;
    void result(){
        System.out.println("work is:"+work);
        System.out.println("Experience is:"+experience);
    }
}
class grandson  extends grandpa{
    String college;
    int cgpa;
    void output(){
        System.out.println("college is:"+college);
        System.out.println("cgpa is:"+cgpa);
    }
}

public class hierarchy {
    public static void main(String[] args) {
        son ss =new son();
        grandson dd = new grandson();
        ss.name="Ramu";
        ss.age=80;
        ss.work="postman";
        ss.experience=10;
        dd.college="VMKV";
        dd.cgpa=8;
        ss.display();
        ss.result();
        dd.output();
    }
}
