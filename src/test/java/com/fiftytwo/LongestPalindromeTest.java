package com.fiftytwo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class LongestPalindromeTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public LongestPalindromeTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( LongestPalindromeTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        String input = "madamthisisatoyotanotaracecar";
        String output = "atoyota";
        String result = LongestPalindrome.go(input);
        assertEquals(output, result);
    }
}
