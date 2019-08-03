/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofnumbers;
import java.util.Scanner;
/**
 *
 * @author Jaswant Singh Samra
 */
public class SumOfNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number = 0, counter = 0, sum = 0, counter2 = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What number do you want to add up to?");
        number = keyboard.nextInt();
        for(int i = 1; i < number; i ++){
            counter+= 1;
            counter2 = 1;
            sum += (counter2 + counter);
        }
       sum +=1;
        System.out.println("Sum: " + sum);
    }
    
}
