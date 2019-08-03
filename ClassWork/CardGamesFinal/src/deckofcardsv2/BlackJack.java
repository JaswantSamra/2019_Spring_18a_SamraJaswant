/*1)B
2)C
3)D
4)B
5)B
6)A
7)C
8)B
9)A
10)C
11)A
12)D
13)C
14)B
15)
16)
17)
18)
19)
20)
21)
22)
23)
24)
25)
26)
27)
28)
29)
30)
31)
32)
33)
*/
package deckofcardsv2;
import java.util.Scanner;
public class BlackJack{

    public BlackJack(Integer a,Integer b, Integer c) {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        int choice;
        
        
        
        System.out.println("WELCOME TO BLACKJACK");
        System.out.println("WOULD YOU LIKE TO PLAY A GAME?");
        System.out.println("(1)Yes or (0)No");
        choice = Integer.parseInt(scan.nextLine());
        

        if(choice == 1){
            blackJack();
        }
            
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////
    public static void blackJack(){
        Scanner scan = new Scanner(System.in);
        
        final int WIN = 21;
        final int HSIZE = 2;
        int c = 0; // counter for the deck
        Deck deck = new Deck();
        BjHand player = new BjHand();
        BjHand dealer = new BjHand();
        int choice = 1;
        
        for (int i = 0; i < 7; i++) {
            deck.shuffle();
        }
        
        for (int i = 0; i < (HSIZE * 2); i++) {
            if(i%2 == 0){
                player.setCards(i/2, c);
                c++;
                
            }
            else if(i%2 == 1){
                dealer.setCards(i/2, c);
                c++;
                
            }
            
        }
        
        
        
        showTable(player, dealer, deck);
        addCards(player, deck);
        addCards(dealer, deck);
        
        
        
        
        while(choice == 1){
            
            System.out.println("Your Sum : " + player.getSum());
            System.out.println("WOULD YOU LIKE TO HIT");
            System.out.println("(1)Yes or (0)No");
            choice = Integer.parseInt(scan.nextLine());
            
            if(choice == 1){
                hit(player, deck, c);
                c++;
            }
            if(player.getSum() > WIN){
                System.out.println("BUST");
                choice = 0;
            }
        }
        if(dealer.getSum() < 17){
            while(dealer.getSum() < 17){
                hit(dealer, deck, c);
                c++;
                System.out.println(dealer.getSum());
                if(dealer.getSum() > WIN){
                    System.out.println("BUST");
                }
            }
        }
        else{
            System.out.println(dealer.getSum());
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////
    public static void showTable(BjHand a, BjHand b, Deck d){
        System.out.println("DEALER CARDS");
        d.cards[b.hand[0]].showCard();
        System.out.println("[FACE-DOWN]\n");
        
        System.out.println("YOUR CARDS");
        for (int i = 0; i < 2; i++) {
            d.cards[a.hand[i]].showCard();
            
            
        }
        System.out.println("");
    }
    
    public static void addCards(BjHand a, Deck d){
        int sum = 0;
        for (int i = 0; i < 2; i++) {
            if(d.cards[a.hand[i]].fValue > 10){
                sum += 10;
            }
            else {
                sum += d.cards[a.hand[i]].fValue;
            }
        }
        a.setSum(sum);
    }
    public static void addCards(BjHand a, Card c, Deck d){
        
    }
    
    public static void hit(BjHand a, Deck d, int c){
        
        int sum = a.getSum();
        
        d.cards[c].showCard();
        System.out.println("");
        
        if(d.cards[c].fValue > 10){
            a.setSum(sum + 10);
        }
        else{
            a.setSum(sum + d.cards[c].fValue);
        }
        
    }
}