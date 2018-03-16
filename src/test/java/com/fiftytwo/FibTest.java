package com.fiftytwo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class FibTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public FibTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( FibTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        long result = Fib.fib(7);
        assertEquals(13l, result);
    }
}
