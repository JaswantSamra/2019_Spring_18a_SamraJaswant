package password;
import java.lang.Math;
import java.util.Scanner;
import java.io.*;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
/**
 *
 * @author Jaswant Singh Samra
 */
public class Password {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner kb = new Scanner(System.in);
        JFileChooser fileChooser = new JFileChooser();
        
        int returnValue = fileChooser.showOpenDialog(null);
        PrintWriter pswd = null;
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            pswd = new PrintWriter(fileChooser.getSelectedFile());
        }
        
        System.out.println("How long do you want this password to be?");
        String result = makePassword(kb.nextInt());
        System.out.println(result);
        pswd.print("New Password = " + result);
        pswd.close();
    }

   public static String makePassword(int length) {
       String password = "";
       for (int i = 0; i < length - 2; i++) {
           password = password + randomCharacter("abcdefghijklmnopqrstuvwxyz"
                   + "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
       }
       
       String randomDigit = randomCharacter("0123456789");
       password = insertAtRandom(password, randomDigit);
       String randomSymbol = randomCharacter("+-*/?@#$%&");
       password = insertAtRandom(password, randomSymbol);
       return password;
   }

    public static String randomCharacter(String characters){
        int n = characters.length();
        int r = (int) (n * Math.random());
        return characters.substring(r, r + 1);
    }
    public static String insertAtRandom(String str, String toInsert){
        int n = str.length();
        int r = (int) ((n + 1) * Math.random());
        return str.substring(0 , r) + toInsert + str.substring(r);
    }

}
