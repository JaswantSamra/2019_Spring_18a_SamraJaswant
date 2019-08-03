/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgrades;
import java.util.Scanner;
/**
 *
 * @author Jaswant Singh Samra
 */
public class TestGrades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Double test1 = 0.0, test2 = 0.0, test3 = 0.0, testAverage = 0.0;
        System.out.println("What did you score on test 1?");
        test1 = keyboard.nextDouble();
        System.out.println("What did you score on test 2?");
        test2 = keyboard.nextDouble();
        System.out.println("What did you score on test 3?");
        test3 = keyboard.nextDouble();
        testAverage = (test1 + test2 + test3) / 3;
        if(testAverage >= 90){
            System.out.println("A average");
        } else if(testAverage < 90  && testAverage >= 80){
            System.out.println("B Average");
        } else if (testAverage < 80 && testAverage >=70){
            System.out.println("C average");
        } else if (testAverage < 70 && testAverage >= 60){
            System.out.println("D average");
        } else {
            System.out.println("F average");
        }
    }
    
}
