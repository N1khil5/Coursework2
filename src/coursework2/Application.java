/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework2;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Nikhil
 */
public class Application {
    
    long accountNo = 9876543210l;
    int accountBalance = 1980;

    //BankAccount bankAccount = new BankAccount(accountNo, accountBalance);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BankAccount bankAccount = new BankAccount(9876543210l, 1980);
        System.out.println("Welcome to the Breaking Bad Bank.");
        System.out.println("Please select a number corresponding to the choice you wish to make.");
        while (true) {
            
            int option = 0;
            
            while (option != 4) {
                
                System.out.println("1. Create Bank Account");
                System.out.println("2. Create User");
                System.out.println("3. Run Simulation");
                System.out.println("4. Exit");
                
                Scanner s = new Scanner(System.in);
                option = s.nextInt();
                
                ArrayList<User> User = new ArrayList<>();
                
                double[] transactionSaul = {50, 10, -20, 10, -20, 20, 10, 50, -10, 10, -10, 50};
                ArrayList<Double> tSaul = new ArrayList<Double>();
                for (int i = 0; i < transactionSaul.length; i++) {
                    tSaul.add(transactionSaul[i]);
                }
                User Saul = new User("Saul", "Goodman", bankAccount, tSaul);
                User.add(Saul);
                
                double[] transactionWalter = {20, 20, -20, 50, -20, 10, 50, 50, -20, 10, 10};
                ArrayList<Double> tWalter = new ArrayList<Double>();
                for (int i = 0; i < transactionWalter.length; i++) {
                    tWalter.add(transactionWalter[i]);
                }
                User Walter = new User("Walter", "White", bankAccount, tWalter);
                User.add(Walter);
                
                double[] transactionJessie = {50, 10, 10, -10, -10, 50, 20, -10, -20};
                ArrayList<Double> tJessie = new ArrayList<Double>();
                for (int i = 0; i < transactionJessie.length; i++) {
                    tJessie.add(transactionJessie[i]);
                }
                User Jessie = new User("Jessie", "Pinkman", bankAccount, tJessie);
                User.add(Jessie);
                
                double[] transactionHank = {50, 10, -20, 20, 10, -20};
                ArrayList<Double> tHank = new ArrayList<Double>();
                for (int i = 0; i < transactionHank.length; i++) {
                    tHank.add(transactionHank[i]);
                }
                User Hank = new User("Hank", "Schrader", bankAccount, tHank);
                User.add(Hank);
                
                switch (option) {
                    case 1:
                        System.out.println("You have selected Create Bank Account.");
                        long accountNo = 9876543210l;
                        int accountBalance = 1980;
                        bankAccount = new BankAccount(accountNo, accountBalance);
                        System.out.println("Congratulations, your account has been created.");
                        System.out.println("Your account number is " + accountNo + "");
                        System.out.println("Your account balance is $" + accountBalance + "");
                        System.out.println("Do you want to use the default users?");
                        String answer = s.next();
                        if (answer.equals("y")) {
                            System.out.println("Please type run simulation to use the default users.");
                            continue;
                        } else {
                            System.out.println("What would you like to name the user?");
                        }
                        String name = s.next();
                        System.out.println("Welcome to Breaking Bad Bank, " + name + "!");
                        System.out.println("Please enter your last name");
                        String surname = s.next();
                        System.out.println("Thank you for banking with us, " + name + " " + surname + "!");
                        System.out.println("Please add the transactions for your account.");
                        System.out.println("Use + for deposits and - for withdrawals.");
                        
                        break;
                    case 2:
                        System.out.println("You have selected Create User.");
                        System.out.println("Please enter the first name of the user");
                        name = s.next();
                        System.out.println("Please enter the last name of the user");
                        surname = s.next();
                        System.out.println("Thank you for banking with us, " + name + " " + surname + "!");
                        System.out.println("Your account number is 9876543210 and your balance in your account is $1980");
                        System.out.println("Please add the transactions for your account.");
                        System.out.println("Use + for deposits and - for withdrawals.");
                        break;
                    case 3:
                        System.out.println("You have selected Run Simulation");
                        for (int i = 0; i < 4; i++) {
                            User.get(i).start();
                        }
                        continue;
                    case 4:
                        System.out.println();
                        System.out.println("You have selected to exit from the program.");
                        System.out.println();
                        System.out.println("Thank you for banking with us!");
                        System.exit(0);
                    default:
                        System.out.println("Please enter a valid input.");
                        System.out.println("Would you like to continue with the program?");
                        System.out.println("Select y for yes and n for no");
                        String choice = s.next();
                        if (choice.equals("y")) {
                            continue;
                        } else {
                            System.exit(0);
                            break;
                        }
                }
            }
        }
        
    }
    
}
