package lesson28.lesson27Hw;

public class Hw27 {
    public static void main(String[] args) {
        BankAccount account=new BankAccount(1000);
        BankAccount account1=new BankAccount(1500);
        account.transferMoney(250,0,account1);
        System.out.println("1@:"+account.checkBalance()+"2@:"+account1.checkBalance());

        //Task2
        Triathlete triathlete=new Triathlete();
        triathlete.run();
        triathlete.swim();
    }
}
