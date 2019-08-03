package payrollexceptions;

/**
 *
 * @author Jaswant Singh Samra
 */
public class PayrollExceptions extends Exception {

 public PayrollExceptions(){
   super("No name specified.")
 }
 public PayrollExceptions(int id){
   super("No negative numbers or zeroes.")
 }
 public PayrollExceptions(String id){
   super("No strings for ID.")
 }
 public PayrollExceptions(double hourly){
   super("No negative numbers of numbers over 25 for hourly rate.")
 }
}
