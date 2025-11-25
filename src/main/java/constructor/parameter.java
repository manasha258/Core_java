package constructor;

public class parameter {
    int age;
    String name;
    String college;
    int marks;
    public parameter(int a,String nm, String clg,int m)
    {
        age=a;
        name=nm;
        college=clg;
        marks=m;
        System.out.println("age"+age+""+"name"+name+""+"college"+college+""+"marks"+marks);
    }

    public static void main(String[] args) {
        parameter pp=new parameter(90,"Manasha","VMKV",90);
    }
}
