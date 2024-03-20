package lesson28.lesson27Hw;

public class ElectronicWallet implements PaymentSystem {

    private  double money;

    @Override
    public void transferMoney(double debet,double credit,PaymentSystem wallet) {
        //TODO
    }

    @Override
    public void depositMoney(double money) {
        this.money+=money;
    }

    @Override
    public void withdrawMoney(double money) {
        this.money+=money;
    }

    @Override
    public double checkBalance() {

        return money;
    }
}
