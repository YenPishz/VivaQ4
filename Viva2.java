/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package viva2;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author YenPishz
 */
public class Viva2 {

    /**
     * @param args the command line arguments
     */
    public static Scanner input = new Scanner(System.in);
    public static ArrayList<String> transactions = new ArrayList<>();
    public static int transactionCT;
    
    public static double checkBalance(double balance)
    {
        System.out.printf("Current balance: RM%.2f %n%n",balance);
        return balance;
    }
    
    public static double deposit(double balance)
    {
        System.out.print("Enter amount to deposit: ");
        double amount = input.nextDouble();
        balance += amount;
        System.out.printf("Your balance is now: RM%.2f %n%n",balance);
        transactionCT++;
        
        transactions.add(String.format("Deposited: RM%.2f",amount));
        
        return balance;
    }
    
    public static double withdraw(double balance)
    {
        System.out.print("Enter amount to withdraw: ");
        double amount = input.nextDouble();
        if (balance < amount)
        {
            System.out.printf("Not Enough Balance: RM%.2f %n%n",balance);
        }
        else
        {
            balance -= amount;
            System.out.printf("Your balance is now: RM%.2f %n%n",balance);
            transactionCT++;
            transactions.add(String.format("Withdrew: RM%.2f", amount));
        } 
        return balance;
    }
    
    public static double printTransactions()
    {
        if (transactionCT == 0) 
        {
            System.out.println("No transactions made \n");
        }
        else 
        {
            for (int i = 0; i < transactionCT; i++) 
            {
                System.out.println(transactions.get(i));
            }
            System.out.println("");
        }
        return 0;
    }
    
    public static void main(String[] args) 
    {//main
      double balance = 0;
      System.out.println("Welcome to the Bank!");
        
      while (true)
      {//main while
          System.out.println("1. Check Balance");
          System.out.println("2. Deposit Money");
          System.out.println("3. Withdraw Money");
          System.out.println("4. View Transaction History");
          System.out.println("5. Exit");
          System.out.print("Choose an option: ");
          int mainopt = input.nextInt();
          
          switch (mainopt)
          {//main switch
              case 1:
                  checkBalance(balance);
              break;
              
              case 2:
                  balance = deposit(balance);
              break;
              
              case 3:
                  balance = withdraw(balance);
              break;
              
              case 4:
                  printTransactions();
              break;
              
              case 5:
                  System.out.println("\nThank you for using our banking system!");
                  System.out.printf("Your final balance is: RM%.2f %n",balance);
                  System.exit(0);
              break;
              
              default:
                  System.out.println("Invalid option, please enter a valid option");
              break;
                  
          }//main switch
      }//main while
    }//main
}
