/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;
import java.util.Scanner;
/**
 *
 * @author Jaswant Singh Samra
 */
public class BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double height = 0.0, weight = 0.0, bmi = 0.0;
        System.out.println("What is your height?");
        height = keyboard.nextInt();
        System.out.println("What is your weight?");
        weight = keyboard.nextInt();
        bmi = (weight * 703)/Math.pow(height, 2);
        if(bmi < 18.5){
            System.out.println("Eat more.");
        } else if(bmi >=18.5 && bmi <= 25){
            System.out.println("You are average weight");
        } else{
            System.out.println("Get to the Gym.");
        }
            
    }
    
}
