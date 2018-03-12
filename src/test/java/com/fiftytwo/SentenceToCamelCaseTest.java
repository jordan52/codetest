package com.fiftytwo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class SentenceToCamelCaseTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SentenceToCamelCaseTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( SentenceToCamelCaseTest.class );
    }

    public void testSimple()
    {
        String input = "This is a sentence";
        String output = "thisIsASentence";
        String result = SentenceToCamelCase.go(input);
        assertEquals(result, output);
    }

    public void testStripPunctuation()
    {
        String input = "This is a sentence.";
        String output = "thisIsASentence";
        String result = SentenceToCamelCase.go(input);
        assertEquals(result, output);
    }

    public void testFirstCap()
    {
        String input = "this is a sentence.";
        String output = "thisIsASentence";
        String result = SentenceToCamelCase.go(input);
        assertEquals(result, output);
    }

    public void testWackyCase()
    {
        String input = "This is A sEnTeNce";
        String output = "thisIsASentence";
        String result = SentenceToCamelCase.go(input);
        assertEquals(result, output);
    }

}
