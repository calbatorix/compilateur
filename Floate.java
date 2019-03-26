
/**
 * Write a description of class Double here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Floate extends Expression
{
    /**
     * Default constructor for objects of class Add
     */
    private double value;
    public Floate(double pValue)
    {
        super();
        this.value = pValue;
    } // Add()
    
    @Override
    public String print()
    {
        return ""+this.value;
    }
} // Add
