
/**
 * Write a description of class Int here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Int extends Expression
{
    private int value;
    /**
     * Default constructor for objects of class Int
     */
    public Int(int pNumber)
    {
        super();
        this.value=pNumber;
    } // Int()
    
    @Override
    public String print()
    {
        return ""+value;
    }
} // Int
