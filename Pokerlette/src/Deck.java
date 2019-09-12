/*
 *  Adapted from Andreas Hadjigeorgiou's code
 *  https://github.com/andyxhadji/Simple-Poker/blob/master/Deck.java
 *  
 *  This class represents the 54 card Deck that the game will use 
 */

import java.util.Random;

public class Deck extends Card          // Inherits the Card Class
{
    private final int DECK_SIZE = 54;           // There are 54 cards in a deck
    private final int SHUFFLE_EXCHANGES = 2000;     // Number of shuffles
    private final int HAND_SIZE = 5;    // 5 cards will be dealt each round

    Card[] deck = new Card[DECK_SIZE];
    Random r = new Random();

    // Fills the deck with cards, one of everything
    public void fillDeck() 
    {
        int counter = 0;
        for (int suit = 0; suit < 4; suit++) 
        {
            for (int rank = 0; rank < 13; rank++) 
            {
                deck[counter] = new Card();
                deck[counter].suitNum = suit;
                deck[counter].rankNum = rank;
                counter++;
            }
        }
        
        deck[52] = new Card(); // Joker
        deck[52].suitNum = 4;
        deck[52].rankNum = 13;
        deck[53] = new Card(); // Joker Plus
        deck[53].suitNum = 4;
        deck[53].rankNum = 14;
    }

    // Shuffles the deck. This occurs every round
    public void shuffle() 
    {
        for (int x = 0; x <= SHUFFLE_EXCHANGES; x++) 
        {
            int number1 = r.nextInt(DECK_SIZE);
            int number2 = r.nextInt(DECK_SIZE);
            Card temp = deck[number1];
            deck[number1] = deck[number2];
            deck[number2] = temp;
        }
    }

    // Deals 5 cards
    public Card[] deal() 
    {
        Card[] hand = new Card[HAND_SIZE];
        for (int deckPosition = 0; deckPosition < 5; deckPosition++) 
        {
            hand[deckPosition] = deck[deckPosition];
            System.out.println(hand[deckPosition]);
        }
        
        return hand;
    }
}