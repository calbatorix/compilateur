public class InferieurEgal extends Expression
{
    /**
     * Default constructor for objects of class Add
     */
    public InferieurEgal(Expression expr1, Expression expr2)
    {
        super(expr1,expr2);
    } // Add()

    @Override
    public String print()
    {
        String out="";
        out=out+"("+aEnfantDroit.print()+"<="+aEnfantGauche.print()+")";
        return out;
    }
} // Add
