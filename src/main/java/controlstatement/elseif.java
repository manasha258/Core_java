package controlstatement;

public class elseif {
    public static void main(String[] args) {
        int value=100;
        if(value<90) {
            System.out.println("ok");
        }
        else if(value<80) {
            System.out.println("done");
        }else if(value<120) {
            System.out.println("correct");
        }else{
            System.out.println("finish");
        }
    }
}
