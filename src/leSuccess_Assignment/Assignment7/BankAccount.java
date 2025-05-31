package leSuccess_Assignment.Assignment7;

public class BankAccount {
    public static void main(String[] args) {
        check obj=new check();
        //obj.balance; //not a statement can't the private one class to another class
    }
}
class check{
    private int balance;
    public void deposit(){
        System.out.println("deposit your money...");
    }
    public void getBalance(){
        System.out.println("get the balance");
    }
}
