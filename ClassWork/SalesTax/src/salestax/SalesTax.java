/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salestax;
import java.util.Scanner;
/**
 *
 * @author Jaswant Singh Samra
 */
public class SalesTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double salesTax = 0.09;
        double price = 0.00;
        double total = 0.00;
        double taxPaid = 0.00;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How much is the price?");
        price = keyboard.nextInt();
        total = (salesTax * price) + price;
        taxPaid = salesTax * price;
        System.out.println("Your total is: $" + total + ".");
        System.out.println("You paid $" + taxPaid + " in tax.");
    }
    
}
