/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timecalculator;
import java.util.Scanner;
/**
 *
 * @author Jaswant Singh Samra
 */
public class TimeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int seconds = 0, minutes = 0, hours = 0, day = 0, menu = 0;
        System.out.println("Input the number of seconds.");
        seconds = keyboard.nextInt();
        minutes = seconds/60;
        hours = minutes / 60;
        day = hours/24;
        System.out.println("Days: " + day + "\nHours: " + hours + "\nMinutes: "
        + minutes);

    }
    
}
