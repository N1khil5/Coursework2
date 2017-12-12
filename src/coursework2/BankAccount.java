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
    
    public long getAccountNo()
    {
        return this.accountNo;
    }
    
    public double getAccountBalance()
    {
        return this.accountBalance;
    }
    
    public void deposit(double value, User u)
    {
        //Code to be implemented here
    }
    
    public void withdraw(double value, User u)
    {
        //Code to be implemented here
    }
}
