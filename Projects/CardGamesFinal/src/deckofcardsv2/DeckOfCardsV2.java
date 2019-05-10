/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deckofcardsv2;
import java.util.Scanner;
import java.lang.String;
/**
 *
 * @author Jaswant Singh Samra
 */
public class DeckOfCardsV2 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
      String response= " ";
        // Seed random number or initialize scanner
        // Constant Variables
        // Declare all Variables Here
        Deck deck = new Deck();
        // Input or initialize values Here
        // Process/Calculations Here
        deck.shuffle();
        // Output Located Here
        deck.showDeck();
        // Exit
        
        Scanner kb = new Scanner(System.in);
        System.out.println("Do you wish to play blackjack?");
        response = kb.nextLine();
        BlackJack bj = new BlackJack(response, 0, 0);
        
        
    }

}
