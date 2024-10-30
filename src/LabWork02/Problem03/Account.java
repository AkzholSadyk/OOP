package LabWork02.Problem03;


public class Account {
    private double balance;
    private double other;
    private int accNumber;

    public Account(double balance, int accNumber,double other) {
        this.balance=0.0;
        this.other=other;
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance>=0) {
            this.balance = balance;
        }
    }

    public double getOther() {
        return other;
    }

    public void setOther(double other) {
        this.other = other;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

}