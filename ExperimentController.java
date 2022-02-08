import java.util.*;
/**
 * Write a description of class ExperimentController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExperimentController
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class ExperimentController
     */
    public ExperimentController()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public long timeAppend(int numberOfItems, int seed)
    {
       long startTime = System.currentTimeMillis();
       IntegerList l = new IntegerList();
       for(int i =0; i<= numberOfItems; i++){
            Random rand = new Random(seed);  
            int m = 201;
            int n = rand.nextInt()%m;
            l.append(n);
       }
       long stopTime = System.currentTimeMillis();
       return stopTime-startTime;  
    }
    
    public long timeToString(int numberOfItems, int seed)
    {
       IntegerList l = new IntegerList();
       for(int i =0; i<= numberOfItems; i++){           
            Random rand = new Random(seed);    
            int m = 201;
            int n = rand.nextInt()%m;
            l.append(n);
       }
       long startTime = System.currentTimeMillis();
       l.toString();
       long stopTime = System.currentTimeMillis();
       return stopTime-startTime;  
    }
}
