package inheritance;
class Teacher{
    String name;
    int id;
    String place;
    void display(){
        System.out.println("Name is:"+name);
        System.out.println("My id is:"+id);
        System.out.println("place is:"+place);

    }
}
class student extends Teacher{
    int Rollno;

    void output(){
        System.out.println("My rollno is:"+Rollno);

    }
}

public class singleinheritance {
    public static void main(String[] args) {
        student ss =new student();
        ss.name="Pavithra";
        ss.id=101;
        ss.place="salem";
        ss.Rollno=28;
        ss.display();
        ss.display();

    }

}
