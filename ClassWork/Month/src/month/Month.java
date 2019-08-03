package month;

/**
 *
 * @author Jaswant Singh Samra
 */
public class Month {
 public static void main(String[] args) {
   try{
     Month month = new Month(13);
   }
   catch(MonthError e){
     System.out.println(e.getMessage());
   }
}
}
class Month{
 int monthNumber;
 public Month(){
   this.monthNumber = 1;
 }public Month(int monthNumber) throws MonthError{
   if(monthNumber > 0 && monthNumber < 13){
     this.monthNumber = 1;
   }
   else{
     throw new MonthError(monthNumber);
   }
  
 }

}
class MonthError extends Exception{
 public MonthError(int monthNumber){
   super("Invalid month value.");
 }
 public MonthError(String month){
   super(month + " already exists.");
 }
}
    }

}
