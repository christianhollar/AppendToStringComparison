
/**
 * Write a description of class IntegerList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IntegerList extends IntegerListADT
{
    // instance variables - replace the example below with your own
    private Cell root;

    /**
     * Constructor for objects of class IntegerList
     */
    public IntegerList()
    {

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void append(int x){
        if(this.root==null){
            this.root = new Cell(x);
        }
        root.append(x);
    }
    public String toString(){
        if(root==null){
            return "";
        }
        else{
            return this.root.toString();
        }
        
    }
    public boolean isEmpty(){
        if(root==null){
            return true;
        }
        else{
            return false;
        }
    }
}
