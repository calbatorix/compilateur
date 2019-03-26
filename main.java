
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    /**
     * main method
     * 
     * @param  pArgs  String array (words on the command line)
     */
    public static void main( final String[] pArgs )
    {
        Expression expr=new Add(new Add(new Int(7),new Int(8)), new Int(4));
        System.out.println(expr.print());
    } // main(.)
} // main
