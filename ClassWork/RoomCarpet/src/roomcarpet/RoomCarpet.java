
package roomcarpet;
import java.util.Scanner;
/**
 *
 * @author Jaswant Singh Samra
 */
class roomDimension{
    public static double roomDimensionArea(double l, double w){
        return l * w;
    }
}
public class RoomCarpet{
    public static void main(String[] args) {
        Double length = 0.0, width = 0.0, price = 0.0, cost = 0.0;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the width and the length");
        roomDimension.roomDimensionArea(length, width);
        System.out.println("This is the area: " + 
                roomDimension.roomDimensionArea(length, width));
        System.out.println("What is the price/sqft?");
        price = kb.nextDouble();
        cost = price * roomDimension.roomDimensionArea(length, width);
        System.out.println("Total cost: $" + cost);
    }
    
}
