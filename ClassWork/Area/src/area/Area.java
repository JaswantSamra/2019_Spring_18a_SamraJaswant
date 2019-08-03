/*
1)C
2)C
3)A
4)C
5)B
6)C
7)D
8)B
9)C
10)A
11)B
12)F
13)F
14)T
15)F
16)F
17)T
18)T
 */
package area;
import java.util.Scanner;
 
public class Area {

    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int response = 0;
        double radius = 0.0, length = 0.0, width = 0.0, height = 0.0, area = 0.0
                ;
        System.out.println("Which shape do you need?");
        System.out.println("1. Circles");
        System.out.println("2. Rectangles");
        System.out.println("3. Cylinders");
        response = kb.nextInt();
        switch(response){
            case 1:
                System.out.println("Very well. Enter the radius: ");
                radius = kb.nextDouble();
                Circles.circleArea(radius);
                System.out.println("Your area is: " + Circles.circleArea(radius));
                break;
            case 2:
                System.out.println("Very Well. Enter Length: ");
                length = kb.nextDouble();
                width = kb.nextDouble();
                System.out.println("Enter Width: ");
                Rectangles.rectangleArea(length, width);
                System.out.println("Your rectangle area is: " + 
                        Rectangles.rectangleArea(length, width));
                break;
            case 3:
                System.out.println("Very Well. Enter radius: ");
                radius = kb.nextDouble();
                System.out.println("Enter height: ");
                height = kb.nextDouble();
                Cylinders.cylinderArea(radius, height);
                System.out.println("Your cylinder area is : " +
                        Cylinders.cylinderArea(radius, height));
                break;
                
        }
        
        
    }
    

}
   class Circles{
        public static double circleArea(double r){
            double area = (Math.PI * Math.pow(r, 2));
            return area;
        }
    }
    class Rectangles{
        public static double rectangleArea(double l, double r){
            double area = l * r;
            return area;
        }
    }
    class Cylinders{
    
        public static double cylinderArea(double r, double h){
            double area = (Math.PI * (Math.pow(r,2) * h));
            return area;
}
}