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
  public static void main(String[] args) {
      Integer response = 0, sum = 0, response2 = 0;

        Deck deck = new Deck();
        // Input or initialize values Here
        // Process/Calculations Here
        deck.shuffle();
        // Output Located Here
        deck.showDeck();
        // Exit
        Scanner kb = new Scanner(System.in);
        System.out.println("Which game do you want to play?");
        System.out.println("1. BlackJack");
        response = kb.nextInt();
        switch(response){
            case 1:
           Scanner kb2 = new Scanner(System.in);
             System.out.println("What do you wish to do in BlackJack?");
             response2 = kb2.nextInt();
             
        break;
        }
        
        
    }

}
