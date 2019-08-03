
package testscores;
import java.util.Scanner;
/**
 *
 * @author Jaswant Singh Samra
 */
public class TestScores {
    public static void main(String[] args) {
       int testScores[] = { 0 , 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
               numberOfTests = 12;
       Scanner kb = new Scanner(System.in);
       System.out.println("How many tests were there?");
        for (int i = 0; i < numberOfTests; i++) {
     
            System.out.println("Please enter Test " + (i + 1) + " score");
            testScores[i] = kb.nextInt();
            if(testScores[i] > 100){
              System.out.println("Invalid Input");
              break;
            }else if (testScores[i] < 0){
              System.out.println("Invalid Input");
              break;
            }
        }
    }

    public TestScores(int testScores[]) throws IllegalArgumentException{
        int sum = 0, average = 0;
        for (int i = 0; i < 12; i++) {
            
            testScores[i] += sum;
            
        }
        average = sum/12;
        System.out.println(average);
    }
}
