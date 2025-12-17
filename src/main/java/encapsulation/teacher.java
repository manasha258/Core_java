package encapsulation;
class students{
    String name;
    int id;
    String college;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}

public class teacher {
    public static void main(String[] args) {
        students ss =new students();
        ss.setId(101);
        ss.setName("manasha");
        ss.setCollege("kiot");
        System.out.println("id is:"+ss.getId());
        System.out.println("name is:"+ss.getName());
        System.out.println("college is:"+ss.getCollege());
    }
}
