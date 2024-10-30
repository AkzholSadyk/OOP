package LabWork02.Problem03;


public class SavingsAccount extends Account {
    private double depositBalance;
    private int TimePeriodBalance;

    public SavingsAccount(int TimePeriodBalance,double balance, double other) {
        super(balance,0,other);
        this.TimePeriodBalance = TimePeriodBalance;
        this.depositBalance=0.0;
    }

    public double getdepositBalance() {
        return depositBalance;
    }

    public int getTimePeriodBalance() {
        return TimePeriodBalance;
    }

    public void Deposit(double amount){
        depositBalance+=amount;
        setBalance(getBalance()+amount);

    }

    public void calculateDeposit(){
        double a=0.06;
        double b=depositBalance*a*TimePeriodBalance;
        setBalance(getBalance()+b);
    }
}