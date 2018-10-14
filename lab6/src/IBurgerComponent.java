package lab6;

/**
 * 
 * @author HarshAgrawal
 * @version 1.0
 * Component Interface for the Composite pattern
 *
 */
public interface IBurgerComponent {
	void printOrderDescription() ;
	double getPrice();
    void addChildComponent(IBurgerComponent c);
    void removeChildComponent(IBurgerComponent c);
    IBurgerComponent getChild(int i);
	void printPriceDescription();

}
