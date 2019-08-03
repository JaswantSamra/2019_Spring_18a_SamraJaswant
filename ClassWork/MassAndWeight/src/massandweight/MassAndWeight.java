/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massandweight;
import java.util.Scanner;
/**
 *
 * @author Jaswant Singh Samra
 */
public class MassAndWeight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double weight = 0.0, mass = 0.0;
        System.out.println("What is the mass?");
        mass = keyboard.nextInt();
        weight = mass * 9.8;
        if(weight > 1000){
            System.out.println("Object is too heavy");
        } else if (weight < 10){
            System.out.println("Object is too light");
        } else {
            System.out.println("Object is okay weight");
        }
    }
    
}
