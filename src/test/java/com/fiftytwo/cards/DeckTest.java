package com.fiftytwo.cards;

import java.util.Set;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class DeckTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public DeckTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( DeckTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        Deck deck = new Deck();
        deck.shuffle();
        Set<Card> stack = deck.getPokerHand();
        
    }
}
