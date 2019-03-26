
/**
 * Write a description of class Mult here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mult extends Expression
{
    /**
     * Default constructor for objects of class Add
     */
    public Mult(Expression expr1, Expression expr2)
    {
        super(expr1,expr2);
    } // Add()
    
    @Override
    public String print()
    {
        String out="";
        out=out+"("+aEnfantDroit.print()+"x"+aEnfantGauche.print()+")";
        return out;
    }
} // Add
