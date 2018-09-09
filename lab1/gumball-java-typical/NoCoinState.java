
public class NoCoinState implements State {
     GumballMachine gumballMachine;
    public NoCoinState(GumballMachine gumballMachine)
    {
        // initialise instance variables
        this.gumballMachine = gumballMachine;
    }

   public void insertCoin(int coin) {
		//System.out.println("You inserted a coin");
		gumballMachine.setState(gumballMachine.getHasCoinState());
	}
 
	public void ejectCoin() {
		System.out.println("You haven't inserted any coin");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but you need to enter coin");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for coin";
	}
}
