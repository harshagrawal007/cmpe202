package lab6;

public class Customer {
	
	public static void main(String[] args) {
		IBurgerComponent theOrder = BuildOrder.getOrder() ;
		
		CustomerReceiptPrinting customerrec =new CustomerReceiptPrinting("Customer Receipt", theOrder);
		customerrec.printDescription();
		
		
		PackingPrinting slip  =new PackingPrinting("Packing Slip",theOrder);
		slip.printDescription();
	}

}
