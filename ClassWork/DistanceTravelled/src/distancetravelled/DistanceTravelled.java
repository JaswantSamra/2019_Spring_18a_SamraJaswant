/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distancetravelled;
import java.util.Scanner;
/**
 *
 * @author Jaswant Singh Samra
 */
public class DistanceTravelled {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double mph = 0.0, time = 0.0, dT = 0.0;
        Scanner kb = new Scanner(System.in);
        System.out.println("How fast in the train going in mph?");
        mph = kb.nextDouble();
        System.out.println("How many hours have passed?");
        time = kb.nextDouble();
        System.out.println("Hour                 Distance Travelled");
        System.out.println("\n---------------------------------------");
        for(int i = 0; i < time; i ++){
            dT += (mph * time);
            System.out.println((i + 1) + ".                          " + dT);
        }
        
    }
    
}
