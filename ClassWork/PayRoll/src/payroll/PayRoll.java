/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;
import java.util.Scanner;
/**
 *
 * @author Jaswant Singh Samra
 */
public class PayRoll {


    public static void main(String[] args) {
        Integer EmployeeID[] = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850
                ,7580489}, hours[] = {0, 0, 0, 0, 0, 0, 0};
        Double payRate[] = {0.0, 0.0 , 0.0, 0.0, 0.0, 0.0, 0.0},
                wages[] = {0.0, 0.0 , 0.0, 0.0, 0.0, 0.0, 0.0},
                grossPay[] = {0.0, 0.0 , 0.0, 0.0, 0.0, 0.0, 0.0};
        Scanner kb = new Scanner(System.in);
        for(Integer index = 0; index < 7; index ++){
         System.out.println("Employee " + EmployeeID[index] + " hours?" );
         hours[index] = kb.nextInt();
         if(kb.nextInt() < 0){
             System.out.println("Error. Hours cannot be negative. Goodbye!");
             break;
         }
         System.out.println("Pay Rate?");
         payRate[index] = kb.nextDouble();
         if(kb.nextDouble() < 6.00){
             System.out.println("Error. Pay Rate cannot be lower than 6."
                     + " Goodbye!");
             break;
         }
         System.out.println("Wages and gross pay will be calculated");
         wages[index] = payRate[index] * hours[index];
         grossPay[index] += wages[index];
        }
        for(Integer i = 0; i < 7; i++){
            System.out.println("Employee " + EmployeeID[i] + ": \n Pay Rate: " 
            + payRate[i] + " /hour" + "\n Wages: " + wages[i] + "\n Gross Pay: " + 
                    grossPay[i]);
        }
    }
}
