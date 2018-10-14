package lab6;

public class PackingPrinting  {
	
	private IBurgerComponent packageorder;
	private String orderdescription;
	
	public PackingPrinting(String desc, IBurgerComponent order) {
		this.packageorder = order;
		orderdescription = desc;
	}

	
	public void printDescription() {
		System.out.println( "===========" + orderdescription + "=====================" );
		for(IBurgerComponent comp:((Composite)packageorder).getComponents()) {
			comp.printOrderDescription();
		}
		System.out.println( "============================================" );
	}

}
