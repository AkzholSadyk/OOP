package LabWork02.Problem03;


import java.util.ArrayList;
public class Bank {
    private ArrayList<Account> accounts;
    public Bank() {
        accounts=new ArrayList<>();
    }

    public void openAccount(Account account) {
        accounts.add(account);
        System.out.println("The account is open. Account number: " + account.getAccNumber());
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added to the bank"+ account.getAccNumber());
    }

    public void removeAccount(int accNumber) {
        accounts.removeIf( account ->account.getAccNumber()==accNumber);
        System.out.println("Account removed: "+accNumber);
    }

    public void updateAccounts(){
        for (Account account:accounts){
            if(account instanceof SavingsAccount){
                ((SavingsAccount) account).calculateDeposit();
            } else if (account instanceof CheckingAccount){
                ((CheckingAccount) account).deductFee();
            }
        }
    }
    public Account getAccount(int accNumber) {
        for (Account account : accounts) {
            if (account.getAccNumber()==accNumber) {
                return account;
            }
        }
        return null;
    }

    public void displayAccounts() {
        System.out.println("Account list:");
        for (Account account : accounts) {
            System.out.println("Check: "+account.getAccNumber()+ ", Balance: "+account.getBalance());
        }
    }

    public int getAccountCount() {
        return accounts.size();
    }

}