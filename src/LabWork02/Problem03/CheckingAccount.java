package LabWork02.Problem03;



public class CheckingAccount extends Account{
    private int transaction;

    public CheckingAccount(double balance, int accNumber, double other) {
        super(balance,accNumber,other);
        transaction=0;
    }

    public int getTransaction() {
        return transaction;
    }

    public void setTransaction(int transaction) {
        this.transaction = transaction;
    }

    public double withdraw(double sum){
        double curBalance = getBalance();
        if (sum>curBalance){
            System.out.println("Insufficient balance");
            return curBalance;
        }
        else{
            curBalance -= sum;
            setBalance(curBalance);
            transaction=transaction+1;
            return curBalance;
        }
    }

    public void transfer(double amount, CheckingAccount other){
        double curBalance = getBalance();
        if(amount>curBalance){
            System.out.println("Insufficient balance");
        }
        else{
            curBalance += amount;
            setBalance(curBalance);
            other.setBalance(other.getBalance()+amount);
            transaction=transaction+1;
            if(transaction>5){
                deductFee();
            }
        }


    }

    public void deductFee(){
        double fee=0.02;
        if(transaction>5){
            double curBalance = getBalance();
            if(fee<curBalance){
                curBalance-=fee;
                setBalance(curBalance);
            }
            else{
                System.out.println("Insufficient balance");
            }

        }
    }


}