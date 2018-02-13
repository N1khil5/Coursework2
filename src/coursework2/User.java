/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework2;

import java.util.ArrayList;
 
/**
 *
 * @author Nikhil
 */
public class User extends Thread{
    private String name;
    private String surname;
    private BankAccount bankAccount;
    private ArrayList<Double> transactionList; 

    public User(String n, String s, BankAccount bA, ArrayList<Double> tL) {
        this.name = n;
        this.surname = s;
        this.bankAccount = bA;
        this.transactionList = tL;
    }

    
    public String getUName(){
        return this.name+" "+this.surname;
    }
    
    @Override
    public void run()
    {
        for(int i=0; i<transactionList.size();i++)
        {
            if(transactionList.get(i)<0)
            {
                 bankAccount.withdraw(transactionList.get(i),getUName());
            }
            else if(bankAccount.getAccountBalance()<=0)
            {
                System.out.println("You currently have $" + bankAccount.getAccountBalance() + ". You cannot make anymore withdrawals at this time.");
                break;
            }
            else
            {
                bankAccount.deposit(transactionList.get(i),getUName());
            }
        }
    }
}
