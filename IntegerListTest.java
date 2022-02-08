

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class IntegerListTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class IntegerListTest
{
    /**
     * Default constructor for test class IntegerListTest
     */
    public IntegerListTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void Test2()
    {
        IntegerList integerL1 = new IntegerList();
        integerL1.append(25);
        integerL1.append(50);
        integerL1.append(100);
        assertEquals(false, integerL1.isEmpty());
        assertEquals("25-50-100", integerL1.toString());
        
        IntegerList integerL2 = new IntegerList();
        integerL2.append(10);
        integerL2.append(20);
        integerL2.append(30);
        assertEquals(false, integerL2.isEmpty());
        assertEquals("10-20-30", integerL2.toString());
        
        IntegerList integerL3 = new IntegerList();
        integerL2.append(100);
        integerL2.append(200);
        integerL2.append(300);
        assertEquals(false, integerL2.isEmpty());
        assertEquals("100-200-300", integerL2.toString());
    }
}

