package lesson28.lesson27Hw;

public interface PaymentSystem {

    public void transferMoney(double debet,double credit,PaymentSystem system);

    void depositMoney(double money);

    public void withdrawMoney(double money);

     public double checkBalance();
}
