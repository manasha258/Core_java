package inheritance;
class father{
    String name;
    int age;
    void display(){
        System.out.println("My name:"+name);
        System.out.println("My age:"+age);
    }
}
class mother extends father{
    String place;
    int salary;
    void result(){
        System.out.println("My place:"+place);
        System.out.println("My salary is:"+salary);
    }
}
class daughter extends mother{
    String college;
    int rollno;
    void output(){
        System.out.println("My College is:"+college);
        System.out.println("My rollno is:"+rollno);
    }
}

public class multilevel {
    public static void main(String[] args) {
        daughter dd = new daughter();
        dd.name="kannan";
        dd.age=50;
        dd.salary=50000;
        dd.place="salary";
        dd.college="vmkv";
        dd.rollno=28;
        dd.display();
        dd.result();
        dd.output();
    }
}
