package lab6;

import java.util.ArrayList;

public class Composite implements IBurgerComponent{
	
	protected ArrayList<IBurgerComponent> components = new ArrayList<IBurgerComponent>()  ;
    protected String Orderdescription ;
    protected double price;
    
    public Composite(String Orderdescription) {
    	this.Orderdescription = Orderdescription;
	}
    
    public Composite(String description, double price) {
    	this.Orderdescription = description;
    	this.price = price;
	}
    
    
    public ArrayList<IBurgerComponent> getComponents() {
		return components;
	}

	public void setComponents(ArrayList<IBurgerComponent> components) {
		this.components = components;
	}

	
	/**
     * Print Description of all the leaf components along with itself
     */
	@Override
	public void printPriceDescription() {
		for(IBurgerComponent obj:components) {
			obj.printPriceDescription();
		}
		
	}
	
	
	@Override
	public void addChildComponent(IBurgerComponent c) {
		components.add(c);
	}
	
	
	@Override
	public void removeChildComponent(IBurgerComponent c) {
		components.remove(c);
		
	}
	
	
	@Override
	public IBurgerComponent getChild(int i) {
		return components.get(i);
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void printOrderDescription() {
		// TODO Auto-generated method stub
		for(IBurgerComponent obj:components) {
			obj.printOrderDescription();
		}
		
	}
    
    
}
