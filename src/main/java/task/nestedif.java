package task;

public class nestedif {
    public static void main(String[] args) {
        String Username="admi";
        String password="ssss";
        if(Username.equals("admin")){
            if(password.equals("ssss")) {
                System.out.println("login successfully");
            }else{
                    System.out.println("wrong password");
                }

            }else{
                System.out.println("wrong username");
            }
        }
    }

