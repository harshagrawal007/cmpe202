package lab6;

import java.text.DecimalFormat;

public class Leaf implements IBurgerComponent {

   private String description ;
   protected double price ;

   public Leaf ( String d, double p )
   {
       description = d ;
       price = p ;
   }
   
   public Leaf ( String d )
   {
       description = d ;
   }
   
   public double getPrice() {
	   return price;
   }

   @Override
   public void printOrderDescription() {
       System.out.println( " " + description + " " ) ;
   }
   
   @Override
	public void printPriceDescription() {
	   DecimalFormat format = new DecimalFormat("0.00");
	   
	   StringBuffer stringbuffer = new StringBuffer();
	   
	   stringbuffer.append(" " + description);
	   
       int descLen = stringbuffer.length() ;
       
       if (descLen < 35 ) {
           int pad = (35 - descLen) / 2 ;
           stringbuffer.append(Padding.padding( pad ));
       }
       stringbuffer.append(format.format(getPrice()));
       System.out.println(stringbuffer);
	}
	 


	@Override
	public void addChildComponent(IBurgerComponent c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeChildComponent(IBurgerComponent c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IBurgerComponent getChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	
}

