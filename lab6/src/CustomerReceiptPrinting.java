package lab6;

import java.text.DecimalFormat;

public class CustomerReceiptPrinting  {
	
	private IBurgerComponent order;
	private String description;
	private double total;
	
	public CustomerReceiptPrinting(String description,IBurgerComponent order) {
		this.order = order;
		this.description = description;
	}

	
	public void printDescription() {
	   System.out.println( "===========" + description + "===========" );
	   for(IBurgerComponent obj:((Composite)order).getComponents()) {
		   obj.printPriceDescription();
		   total += obj.getPrice();
		}
	   DecimalFormat format = new DecimalFormat("0.00");
	   
	   StringBuffer stringbuffer = new StringBuffer();
	   
	   stringbuffer.append(" Sub. Total:");
       
       if (stringbuffer.length() < 30 ) {
           int pad = (30 - stringbuffer.length()) / 2 ;
           stringbuffer.append(Padding.padding( pad ));
       }
       stringbuffer.append("$"+format.format(total));
       
       System.out.println(stringbuffer);
       
	   System.out.println( "============================================" );
	}

}
