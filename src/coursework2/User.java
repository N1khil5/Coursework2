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
public class User {
    private String name;
    private String surname;
    private BankAccount bankAccount;
    private ArrayList<Double> transactionList; 

    public User(String n, String s, BankAccount bA) {
        this.name = n;
        this.surname = s;
        this.bankAccount = bA;
        this.transactionList = new ArrayList<Double>();
    }
    
    public void addTransaction (double transaction) {
        
        transactionList.add(transaction);
        
    }
    
}
