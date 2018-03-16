package com.fiftytwo.cards;

public class Card {

    public static String[] suits = {"diamonds","clubs","hearts", "spades"};
    public static String[] ranks = {"ace", "2", "3", "4","5","6","7","8","9","10","jack","queen","king"};
    
    private String suit;
    private String rank;

    public Card(String suit, String rank){
        rank = rank;
        suit = suit;
    }
    public String getRank(){
        return rank;
    }
    public String getSuit(){
        return suit;
    }
    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(o == null)
            return false;
        Card other = (Card) o;
        if(suit == null){
            if(other.suit != null)
                return false;
        } else if(!suit.equals(other.suit)){
            return false;
        }
        if(rank == null){
            if(other.rank != null)
                return false;
        } else if(!rank.equals(other.rank)){
            return false;
        }
        return true;
    }

}