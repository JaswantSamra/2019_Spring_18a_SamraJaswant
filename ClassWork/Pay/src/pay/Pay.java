/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pay;
import java.util.Scanner;
/**
 *
 * @author Jaswant Singh Samra
 */
public class Pay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many hours did you work?");
        Double hours = Double.parseDouble(keyboard.nextLine());
        System.out.println("How much are you paid by hour?");
        Double rate = Double.parseDouble(keyboard.nextLine());
        
        Double pay;
        Double Overtime;
        
        if(hours <= 40){
            pay = rate * hours;
            Overtime = 0.0;
        }
        else{
            pay = 0.0;
            Overtime = (hours - 40) * (1.5 * rate) + (rate * 40);
        }
        
        System.out.println("You have earned: $" + (pay + Overtime));
    }
}
