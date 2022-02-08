

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CellTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CellTest
{
    /**
     * Default constructor for test class CellTest
     */
    public CellTest()
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
    public void Test1()
    {
        Cell cell1 = new Cell(10);
        cell1.append(15);
        assertEquals("10-15", cell1.toString());
        
        Cell cell2 = new Cell(15);
        cell1.append(15);
        assertEquals("15-15", cell1.toString());
        
        Cell cell3 = new Cell(20);
        cell1.append(15);
        assertEquals("20-15", cell1.toString());
    }
}

