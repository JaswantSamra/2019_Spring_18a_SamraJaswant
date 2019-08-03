/*
CIS-18A S2019 Homework 6
Jaswant Singh Samra
1)B
2)A
3)B
4)D
5)C
6)C
7)B
8)A
9)D
10)A
11)C
12)A
13)A
14)T
15)F
16)T
17)T
18)T
19)T
20)T
21)F
22)T
23)T
 */
package rainfall;
import java.util.Scanner;
/**
 *
 * @author Jaswant Singh Samra
 */
public class RainFall{
    private static int i;
    
    public static void main(String[] args) {
        double rainFall[] = { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
        double max, min;
        String MonthName[] = {"January", "February", "March", "April", "May",
         "June", "July", "August", "September", "October", "November", "December"};
        Scanner kb = new Scanner(System.in);
        System.out.println("Input Rain Fall amounts for 12 months");
        for(Integer index = 0; index < 12; index ++){
            System.out.println(MonthName[i] + ": ");
            i++;
            rainFall[index] = kb.nextInt();
        }
        for(Integer index = 0; index < 12; index ++){
            System.out.println(rainFall[index]);
        }
        max = rainFall[0];
        for(int i = 0; i < 12; i++)
        {
            if(max < rainFall[i])
            {
                max = rainFall[i];
            }
        }
        min = rainFall[0];
           for(int i=1;i<rainFall.length;i++){
           if(rainFall[i] < min){
              min = rainFall[i];
	}
  }
        System.out.println("The Maximum number is: " + max + ".");
        System.out.println("The Minimum number is: " + min + ".");
    }
}
