package textbasedgame;

/**
 *
 * @author Jaswant Singh Samra
 */
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class TextBasedGame {

    public static void main(String[] args) throws Exception {
        String name = "";
        Scanner kb = new Scanner(System.in);
        System.out.println("Welcome to this game, Adventurer! What can I call you?");
        name = kb.nextLine();
        TimeUnit.SECONDS.sleep(15);
        Monkey m = new Monkey();
        m.showMonkey();
    }

}
