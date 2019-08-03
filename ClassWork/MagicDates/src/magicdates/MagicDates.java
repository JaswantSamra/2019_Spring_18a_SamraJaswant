/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicdates;
import java.util.Scanner;
/**
 *
 * @author Jaswant Singh Samra
 */
public class MagicDates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer month = 0;
        Integer day = 0;
        Integer year = 0;
        Integer mDay = 0;
        String output = "";
        boolean magicDate = false;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the month?");
        month = keyboard.nextInt();
        System.out.println("What is the day?");
        day = keyboard.nextInt();
        System.out.println("What is the last two digits of the year?");
        year = keyboard.nextInt();
        mDay = month * day;
        if(mDay.equals(year)){
            output = String.format("The date %d/%d/%d, is magic!", month, day,
                    +year);
        } else {
            output = String.format("The date %d/%d/%d, is not magic :( ", 
                    + month, day, year);
        }
        System.out.println(output);
}
