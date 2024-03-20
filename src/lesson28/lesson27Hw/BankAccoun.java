package lesson28.lesson27Hw;

class BankAccount implements  PaymentSystem{

private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void transferMoney(double debet,double credit,PaymentSystem account) {
        if (debet>0){
            balance -=debet;
            account.depositMoney(debet);
            account.transferMoney(0,debet,this);
        }else if (credit>0){

        }
    }

    public void depositMoney(double money){
        balance +=money;
    }

    @Override
    public void withdrawMoney(double money){
        balance -=money;
    }

    @Override
    public double checkBalance() {
        return balance;

    }
}
