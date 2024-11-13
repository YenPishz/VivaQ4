/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vivaq4;

import java.util.Scanner;

/**
 *
 * @author YenPishz
 */
public class VivaQ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mainoption;
        int suboption;
        double total = 0;
        int ct1 = 0;
        int ct2 = 0;
        int ct3 = 0;
        
        //Prices 
        int chicPep = 15;
        int chicSupr = 18;
        int vegan = 12;
        int beef = 22;
        int margherita = 9;
        
        int strawbSmoothie = 8;
        int bananaSmoothie = 8;
        int mocktail = 12;
        int softDrink = 5;
        int water = 3;
        
        int tiramisu = 7;
        int strawbCake = 10;
        int jello = 4;
        int creme = 15;
        int raspPie = 20;
        
        //for outer
        while (true)
        { //main while true
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Maroni's Pizza!");
        System.out.println("1. Pizza");
        System.out.println("2. Drinks");
        System.out.println("3. Dessert");
        System.out.println("4. CHECKOUT");
        System.out.println("5. Exit Program");
        System.out.print("\nPick an option: ");
            
         mainoption = input.nextInt();
         System.out.print("\n");

         switch (mainoption)
          { //main switch
             case 1:
                System.out.println("PIZZA");
                System.out.println("1. Chicken Peperoni - RM15");
                System.out.println("2. Chicken Supreme - RM18");
                System.out.println("3. Vegan Indulgence - RM12");
                System.out.println("4. Beef Delight - RM22");
                System.out.println("5. Margherita - RM9");
                System.out.println("6. BACK TO MAIN MENU \n"); 
                 
             while (true) 
             { //while true 1
                
                System.out.print("Pick an option: ");
                suboption = input.nextInt();
                if (suboption == 1)
                {
                    System.out.println("Added Chicken Peperoni");
                    total += chicPep;
                    ct1++;
                    System.out.printf("Current total : RM%.2f %n%n",total); 
                }
                else if (suboption == 2)
                {
                    System.out.println("Added Chicken Supreme");
                    total += chicSupr;
                    ct1++;
                    System.out.printf("Current total : RM%.2f %n%n",total);
                }
                else if (suboption == 3)
                {
                    System.out.println("Added Vegan Indulgence");
                    total += vegan;
                    ct1++;
                    System.out.printf("Current total : RM%.2f %n%n",total);
                }
                else if (suboption == 4)
                {
                    System.out.println("Added Beef Delight");
                    total += beef;
                    ct1++;
                    System.out.printf("Current total : RM%.2f %n%n",total);
                }
                else if (suboption == 5)
                {
                    System.out.println("Added Margherita");
                    total += margherita;
                    ct1++;
                    System.out.printf("Current total : RM%.2f %n%n",total);
                }
                else if (suboption == 6)
                {
                    System.out.println("Going Back to Main Menu \n");
                    break;
                }
                        
                else
                {
                    System.out.println("Invalid Option, Going Back to Main Menu\n");
                    break;
                }
             } //while true 1
             break;
             
             case 2:
                System.out.println("DRINKS");
                System.out.println("1. Strawberry Smoothie - RM8");
                System.out.println("2. Banana Smoothie - RM8");
                System.out.println("3. Mocktail - RM12");
                System.out.println("4. Soft Drink - RM5");
                System.out.println("5. Mineral Water - RM3");
                System.out.println("6. BACK TO MAIN MENU \n");
             while (true)
             { //while true 2
                System.out.print("Pick an option: ");
                suboption = input.nextInt();
                if (suboption == 1)
                {
                    System.out.println("Added Strawberry Smoothie");
                    total += strawbSmoothie;
                    ct2++;
                    System.out.printf("Current total : RM%.2f %n%n",total);
                }
                else if (suboption == 2)
                {
                    System.out.println("Added Banana Smoothie");
                    total += bananaSmoothie;
                    ct2++;
                    System.out.printf("Current total : RM%.2f %n%n",total);
                }
                else if (suboption == 3)
                {
                    System.out.println("Added Mocktail");
                    total += mocktail;
                    ct2++;
                    System.out.printf("Current total : RM%.2f %n%n",total);
                }
                else if (suboption == 4)
                {
                    System.out.println("Added Soft Drink");
                    total += softDrink;
                    ct2++;
                    System.out.printf("Current total : RM%.2f %n%n",total);
                }
                else if (suboption == 5)
                {
                    System.out.println("Added Mineral Water");
                    total += water;
                    ct2++;
                    System.out.printf("Current total : RM%.2f %n%n",total);
                }
                else if (suboption == 6)
                {
                    System.out.println("Going Back to Main Menu\n");
                    break;
                }
                else
                {
                    System.out.println("Invalid Option, Going Back to Main Menu\n");
                    break;
                }
             } //while true 2
             break;
             
             case 3:
                System.out.println("DESSERT");
                System.out.println("1. Tiramisu - RM7");
                System.out.println("2. Strawberry Shortcake - RM10");
                System.out.println("3. Green Jello - RM4");
                System.out.println("4. Creme Brulee - RM15");
                System.out.println("5. Raspberry Pie - RM20");
                System.out.println("6. BACK TO MAIN MENU \n");
                
                
             while (true)
             { //while true 3
                System.out.print("Pick an option: ");
                suboption = input.nextInt();
                if (suboption == 1)
                {
                    System.out.println("Added Tiramisu");
                    total += tiramisu;
                    ct3++;
                    System.out.printf("Current total : RM%.2f %n%n",total);
                }
                else if (suboption == 2)
                {
                    System.out.println("Added Strawberry Shortcake");
                    total += strawbCake;
                    ct3++;
                    System.out.printf("Current total : RM%.2f %n%n",total);
                }
                else if (suboption == 3)
                {
                    System.out.println("Added Green Jello");
                    total += jello;
                    ct3++;
                    System.out.printf("Current total : RM%.2f %n%n",total);
                }
                else if (suboption == 4)
                {
                    System.out.println("Added Creme Brulee");
                    total += creme;
                    ct3++;
                    System.out.printf("Current total : RM%.2f %n%n",total);
                }
                else if (suboption == 5)
                {
                    System.out.println("Added Raspberry Pie");
                    total += raspPie;
                    ct3++;
                    System.out.printf("Current total : RM%.2f %n%n",total);
                }
                else if (suboption == 6)
                {
                    System.out.println("Going Back to Main Menu\n");
                    break;
                }
                else
                {
                    System.out.println("Invalid Option, Going Back to Main Menu\n");
                    break;
                }
             } //while true 3
             break;
             
             case 4:
                 if (ct1 >= 1 && ct2 >=1 && ct3 >= 1)
                 {
                 System.out.printf("Your total is RM%.2f! %n",total);
                 System.out.println("You've availed the One-of-each offer. You get a 20% discount!");
                 total *= 0.8;
                 System.out.printf("Your new total is RM%.2f! %n%n",total);
                 System.out.println("Have a nice day!");
                 System.exit(0);
                 }
                 else 
                 {
                 System.out.printf("Your total is RM%.2f! %n",total);
                 System.out.println("Have a nice day!");
                 System.exit(0);
                 }
             break;
             
             case 5:
                 System.out.println("Exitting Program");
                 System.exit(0);
             break;
                 
             default:
                 System.out.println("Invalid Option, Please Enter a Valid Option!\n");
             break;
         
          }//main switch
        } //main while true
    }
    
}
