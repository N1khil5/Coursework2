/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework2;

/**
 *
 * @author Nikhil
 */
public class BankAccount {

    private long accountNo;
    private double accountBalance;

    public BankAccount(long accountNo, double accountBalance) {
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }

    public long getAccountNo() {
        return this.accountNo;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public synchronized void deposit(double value, String name) {
        System.out.println("User " + name + " has deposited funds to the account in the amount of " + value);
        accountBalance = (accountBalance + value);
        System.out.println("Account Balance: " + accountBalance);
    }

    public synchronized void withdraw(double value, String name) {
        System.out.println("User " + name + " has withdrawn funds from the account in the amount of " + value);        
        accountBalance+=value;
        System.out.println("Account Balance After Withdrawal: " + accountBalance);
    }
}
