
/**
 * Write a description of class Expression here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Expression
{
    // instance variables - replace the example below with your own
    protected Expression aParent;
    protected Expression aEnfantDroit;
    protected Expression aEnfantGauche;

    /**
     * Default constructor for objects of class Expression
     */
    public Expression(Expression enfantDroit,Expression enfantGauche)
    {
        this.aParent = null;
        this.aEnfantDroit = enfantDroit;
        this.aEnfantGauche= enfantGauche;
        this.aEnfantDroit.addParent(this);
        this.aEnfantGauche.addParent(this);
    } // Expression()
    
    public Expression()
    {
        this.aParent = null;
        this.aEnfantDroit = null;
        this.aEnfantGauche= null;
    }
    
    public void addParent(Expression pParent)
    {
        this.aParent = pParent;
    }
    
    public String print()
    { return "";}
} // Expression
