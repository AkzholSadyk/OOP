package LabWork02.Problem03;

public class TesterForProblem03 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        CheckingAccount checkingAccount1 = new CheckingAccount(5000.0, 1, 1500.0);
        CheckingAccount checkingAccount2 = new CheckingAccount(2000.0, 2, 500.0);
        CheckingAccount checkingAccount3 = new CheckingAccount(500.0, 4, 500.0);
        CheckingAccount checkingAccount4 = new CheckingAccount(10.0, 3, 500.0);
        SavingsAccount savingsAccount1 = new SavingsAccount(6, 2000.0, 0.0);
        SavingsAccount savingsAccount2 = new SavingsAccount(12, 1500.0, 0.0);

        bank.openAccount(checkingAccount1);
        bank.openAccount(checkingAccount2);
        bank.openAccount(checkingAccount3);
        bank.openAccount(checkingAccount4);
        bank.openAccount(savingsAccount1);
        bank.openAccount(savingsAccount2);

        bank.displayAccounts();

        bank.updateAccounts();
        System.out.println("After refreshing:");
        bank.displayAccounts();

        checkingAccount1.transfer(200.0, checkingAccount2);
        System.out.println("After transfer:");
        bank.displayAccounts();

        bank.removeAccount(1);

        System.out.println("Count of accounts in the bank: " + bank.getAccountCount());
    }
}
