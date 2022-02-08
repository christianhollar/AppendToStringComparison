
/**
 * Write a description of class Cell here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cell
{
    // instance variables - replace the example below with your own
    private int val;
    private Cell next; 

    /**
     * Constructor for objects of class Cell
     */
    public Cell(int val)
    {
        // initialise instance variables
        this.val = val;
        this.next = null;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void append(int x)
    {
        // put your code here
        if(this.next==null){
            next = new Cell(x);
        } else{
           next.append(x); 
        }
        
    }
    
    public String toString(){
        if(next==null){
            return String.valueOf(val);
        }
        return val+"-" +next.toString();
    }
}
