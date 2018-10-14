package lab6;

import java.text.DecimalFormat;

/**
 * 
 * @author HarshAgrawal
 * @version 1.0
 * Prints the Burger with Price and description
 *
 */
public class Burger extends Composite
{
    public Burger ( String Orderdescription, double price)
    {
        super(Orderdescription,price) ;
    }
    
    public void printPriceDescription() {
        DecimalFormat fmt = new DecimalFormat("0.00");
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(" " + Orderdescription);
      
        if (stringbuffer.length() < 35 ) {
            int pad = (35 - stringbuffer.length()) / 2 ;
            stringbuffer.append(Padding.padding( pad ));
        }
        
        stringbuffer.append(fmt.format(getPrice()));
        
        System.out.println(stringbuffer);
        for (IBurgerComponent brgc  : components)
        {
        	brgc.printPriceDescription();
        }
    }
    
    public void printDescription() {
        System.out.println( " " + Orderdescription + " " );
        for (IBurgerComponent brgc  : components)
        {
        	brgc.printPriceDescription();
        }
    }
}