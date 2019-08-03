/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

/**
 *
 * @author Jaswant Singh Samra
 */
import java.util.Scanner;
/**
   This program demonstrates static methods
*/ 
public class Geometry
{
    public void printMenu(){
        System.out.println("This is a geometry calculator");
        System.out.println("Choose what you would like to calculate"); 
        System.out.println("1.  Find the area of a circle");  
        System.out.println("2.  Find the area of a rectangle"); 
        System.out.println("3.  Find the area of a triangle");  
        System.out.println("4.  Find the circumference of a circle");  
        System.out.println("5.  Find the perimeter of a rectangle"); 
        System.out.println("6.  Find the perimeter of a triangle\n" +
"          Enter the number of your choice:"); 
    }
    public static double circleArea(double a){ //gets the area of the circle
        return Math.PI * Math.pow(a, 2); //Multiplies pi with radius^2
    }
    public static double rectangleArea(double a, double b){ //gets the area of a
                                                            //rectangle
        return a * b; //multiplies the length and width together
    }
    public static double triangleArea(double a, double b){//gets area of triangle
        return (0.5) * (a * b); //0.5 = 1/2 then multiplied with base and height
    }
    public static double circleCircumference(double a){ //get circumference of
                                                        //circle
        return (2 * Math.PI) * a; // multiplies 2Pi then multiplies w/radius
    }
    public static double rectanglePerimeter(double a, double b){ //gets the 
                                                      //perimeter of a rectangle
        return (2 * a) + (2 * b); // multiplies 2 length and adds with 2 base
    }
    public static double trianglePerimeter(double a, double b, double c){ //gets
                                                   //the perimeter of a triangle
        return a + b + c; // adds all 3 sides together
    }
   public static void main(String[] args)
   {
      int choice;       // The user's choice
      double value = 0; // The method's return value
char letter;
double radius;
double length;
double width;
double height;
double base;
double side1;
double side2;
double side3;
// The user's Y or N decision
// The radius of the circle
// The length of the rectangle
// The width of the rectangle
// The height of the triangle
// The base of the triangle
// The first side of the triangle
// The second side of the triangle
// The third side of the triangle
// Create a scanner object to read from the keyboard
Scanner keyboard = new Scanner(System.in);
// The do loop allows the menu to be displayed first
do
{
   // TASK #1 Call the printMenu method
    Geometry menu = new Geometry();
    menu.printMenu();
   choice = keyboard.nextInt();
switch (choice)
{
   case 1:
      System.out.print("Enter the radius of " +
                       "the circle: ");
      radius = keyboard.nextDouble();
      value = circleArea(radius);
      // TASK #3 Call the circleArea method and
      // store the result in the value variable
      System.out.println("The area of the " +
                         "circle is " + value);
      break;
   case 2:
      System.out.print("Enter the length of " +
                       "the rectangle: ");
      length = keyboard.nextDouble();
      System.out.print("Enter the width of " +
                       "the rectangle: ");
      width = keyboard.nextDouble();
      // TASK #3 Call the rectangleArea method and
      // store the result in the value variable
      value = rectangleArea(length, width);
      System.out.println("The area of the " +
                         "rectangle is " + value);
      break;
   case 3:
      System.out.print("Enter the height of " +
                       "the triangle: ");
      height = keyboard.nextDouble();
      System.out.print("Enter the base of " +
                       "the triangle: ");
      base = keyboard.nextDouble();
      // TASK #3 Call the triangleArea method and
      // store the result in the value variable
      value = triangleArea(height, base);
      System.out.println("The area of the " +
                         "triangle is " + value);
      break;
   case 4:
      System.out.print("Enter the radius of " +
                       "the circle: ");
      radius = keyboard.nextDouble();
 
   // TASK #3 Call the circumference method and
   // store the result in the value variable
      value = circleCircumference(radius);
   System.out.println("The circumference " +
                      "of the circle is " +
value); 
   break;
case 5:
   System.out.print("Enter the length of " +
                    "the rectangle: ");
   length = keyboard.nextDouble();
   System.out.print("Enter the width of " +
                    "the rectangle: ");
   width = keyboard.nextDouble();
   // TASK #3 Call the perimeter method and
   // store the result in the value variable
   value = rectanglePerimeter(length, width);
   System.out.println("The perimeter of " +
                      "the rectangle is " +
value); 
   break;
case 6:
   System.out.print("Enter the length of " +
                    "side 1 of the " +
                    "triangle: ");
   side1 = keyboard.nextDouble();
   System.out.print("Enter the length of " +
                    "side 2 of the " +
                    "triangle: ");
   side2 = keyboard.nextDouble();
   System.out.print("Enter the length of " +
                    "side 3 of the " +
                    "triangle: ");
   side3 = keyboard.nextDouble();
   // TASK #3 Call the perimeter method and
   // store the result in the value variable
   value = trianglePerimeter(side1, side2, side3);
   System.out.println("The perimeter of " +
                      "the triangle is " + value); 
   break;
        default:

         System.out.println("You did not enter " +
                   "a valid choice.");
        }
          keyboard.nextLine(); // Consume the new line
          System.out.println("Do you want to exit " +
                         "the program (Y/N)?: ");
          String answer = keyboard.nextLine();
          letter = answer.charAt(0);
        } while(letter != 'Y' && letter != 'y');
    }
}
// TASK #1 Create the printMenu method here
// TASK #2 Create the value-returning methods here
// TASK #4 Write javadoc comments for each method