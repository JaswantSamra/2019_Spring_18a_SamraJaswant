package codedemo;
import java.util.Scanner;
public class CodeDemo {
    public static void main(String[] args) {
        String name = "";
        System.out.println("Welcome to this program");
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter your name");
        name = kb.nextLine();
        System.out.println("Hello " + name + ".");
    }

}
