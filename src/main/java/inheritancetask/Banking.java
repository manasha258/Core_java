package inheritancetask;

class Account {
    String Accno;
    double amount;

    void display() {
        System.out.println("Account number is:" + Accno);
        System.out.println("Amount is:" + amount);
    }
}
class SavingAccount extends Account {
    double interest;

    void result() {
        System.out.println("Interest is:" + interest);
    }
}
class currentAcoount extends SavingAccount {
    double overdraft;

    void solution() {
        System.out.println("Overdraft is:" + overdraft);
    }
}
class loanaccount extends Account{
    int rupees;
    void result(){
        System.out.println("Amount is:"+rupees);
    }
}
class EMI extends Account{
    int payment;
    void emi(){
        System.out.println("EMI amount:"+payment);
    }
}
class premiumaccount extends currentAcoount implements interfaceDeposit,interfaceWithdraw{

    @Override
    public void deposit(double amt) {
        System.out.println("My deposit amount is:"+amt);
    }

    @Override
    public void withdraw(double amt) {
        System.out.println("My Withdraw amount is:"+amt);

    }
}

public class Banking {
    public static void main(String[] args) {
        SavingAccount ss =new SavingAccount();
        ss.interest=500;
        ss.amount=10000;
        ss.result();
        ss.display();
        currentAcoount aa =new currentAcoount();
        aa.Accno="cur001";
        aa.amount=20000;
        aa.overdraft=1000;
        aa.display();
        aa.solution();
        loanaccount ll =new loanaccount();
        ll.amount=50000;
        ll.rupees=670000;
        ll.display();
        ll.result();
        EMI emi =new EMI();
        emi.payment=2500;
        emi.amount=5400;
        emi.display();
        emi.emi();
        premiumaccount pp =new premiumaccount();
        pp.amount=90000;
        pp.overdraft=7000;
        pp.deposit(2000);
        pp.withdraw(1000);
        pp.display();

    }
}
