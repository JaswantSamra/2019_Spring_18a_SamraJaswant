/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statsdemo;

/**
 *
 * @author Jaswant Singh Samra
 */
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Random;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader; 
import java.io.FileReader;
public class StatsDemo
{
   // TASK #3 Add the throws clause
   public static void main(String[] args) throws FileNotFoundException, IOException
   {
    double sum = 0.0; // The sum of the numbers
    int count = 0; // The number of numbers added
    double mean = 0.0; // The average of the numbers
    double stdDev = 0.0; // The standard deviation
    String line; // To hold a line from the file
    double difference; // The value and mean difference
    double[] numArray;
       numArray = new double[6];
    
      
    final int ROLLS = 5; 

// Create an object of type Scanner
    Scanner keyboard = new Scanner (System.in);
    String filename;     // The user input file name
// Prompt the user and read in the file name
    System.out.println("This program calculates statistics on a file containing"
            + " a series of numbers");
    System.out.print("Enter the file name:  ");
    filename = keyboard.nextLine();
    for (int i = 0; i < 5; i ++){
        numArray[i] = (int) (Math.random() * 100);
    }
    sum = numArray[1] + numArray[2] + numArray[3] + numArray[4] + numArray[5]
            + numArray[0];
    mean = sum/6;
    stdDev = calculateSD(numArray);
    difference = mean - stdDev;
// ADD LINES FOR TASK #4 HERE

    File file = new File("Results.txt");
    FileWriter writer = null;
    PrintWriter print = null;
    Scanner one = null;
    Scanner two = null;
    FileReader fr; // Create a FileReader 
       fr = new FileReader(file);
    //object passing it the filename
    BufferedReader br = new BufferedReader(new FileReader("Results.txt"));
// Create a BufferedReader object passing FileReader object
try{
    writer = new FileWriter("Results.txt");
    print = new PrintWriter("Results.txt");
    one = new Scanner("Results.txt");
    two = new Scanner("Results.txt");
}
catch(FileNotFoundException ex){
    System.out.println("File not Found. Try again.");
}
catch(IOException ex) {
    System.out.println("IO Exception. Try again.");
}
writer.write("The mean of these number is: " + mean + "." + "/t" + "The Standard"
        + " deviation of these number is: " + stdDev);
           char[] f = new char[100];
        fr.read(f);
    }
  public static double calculateSD(double numArray[])
    {
        double sum = 0.0, standardDeviation = 0.0;
        int length = numArray.length;

        for(double num : numArray) {
            sum += num;
        }

        double mean = sum/length;

        for(double num: numArray) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }

}

// Perform a priming read to read the first line of
// the file
// Loop until you are at the end of the file
// Convert the line to a double value and add the
// value to sum
// Increment the counter
// Read a new line from the file
// Close the input file
// Store the calculated mean
// ADD LINES FOR TASK #5 HERE
// Reconnect FileReader object passing it the
// filename
// Reconnect BufferedReader object passing
// FileReader object
// Reinitialize the sum of the numbers
// Reinitialize the number of numbers added
// Perform a priming read to read the first line of
// the file
// Loop until you are at the end of the file
// Convert the line into a double value and
// subtract the mean
// Add the square of the difference to the sum
// Increment the counter
// Read a new line from the file
// Close the input file
// Store the calculated standard deviation
// ADD LINES FOR TASK #3 HERE
// Create a FileWriter object using "Results.txt"
// Create a PrintWriter object passing the
