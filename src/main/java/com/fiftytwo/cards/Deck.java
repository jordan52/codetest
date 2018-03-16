package com.fiftytwo.cards;

import java.util.HashSet;
import java.util.Set;

public class Deck {

    Set<Card> deck;

    public void shuffle(){
        deck = new HashSet<Card>();
    }

    public Set<Card> getPokerHand(){
        // pull a hand of cards off the deck
        return new HashSet<Card>();
    }
}