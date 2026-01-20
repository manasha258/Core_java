package task;

import java.util.*;

    class Bank {
        String bankName;
    }

    class Account extends Bank {

        int accNo;
        String name;
        double balance;

        Account(int accNo, String name, double balance, String bankName) {
            this.accNo = accNo;
            this.name = name;
            this.balance = balance;
            this.bankName = bankName;
        }

        void deposit(double amt) {
            balance += amt;
        }

        void display() {
            System.out.println(accNo + " " + name + " " + balance + " " + bankName);
        }
    }

    class ProgramTask {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            ArrayList<Account> list = new ArrayList<>();

            System.out.print("Enter number of accounts: ");
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.print("Enter Account No: ");
                int accNo = sc.nextInt();

                System.out.print("Enter Name: ");
                String name = sc.next();

                System.out.print("Enter Balance: ");
                double balance = sc.nextDouble();

                System.out.print("Enter Bank Name: ");
                String bankName = sc.next();

                list.add(new Account(accNo, name, balance, bankName));
            }

            System.out.print("Enter deposit amount: ");
            double dep = sc.nextDouble();

            for (Account a : list) {
                a.deposit(dep);
                a.display();
            }

            try {
                System.out.print("Enter a number: ");
                int x = sc.nextInt();
                System.out.println(10 / x);
            } catch (Exception e) {
                System.out.println("Runtime Exception handled");
            }

            System.out.print("Enter a word: ");
            String s = sc.next();
            System.out.println(s.toUpperCase());

            System.out.print("Enter two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);

            sc.close();
        }
    }


