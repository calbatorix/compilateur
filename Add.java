
/**
 * Write a description of class Add here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Add extends Expression
{
    /**
     * Default constructor for objects of class Add
     */
    public Add(Expression expr1, Expression expr2)
    {
        super(expr1,expr2);
    } // Add()
    
    @Override
    public String print()
    {
        String out="";
        out=out+"("+aEnfantDroit.print()+"+"+aEnfantGauche.print()+")";
        return out;
    }
} // Add
