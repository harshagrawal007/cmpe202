
public class GumballMachine {

	State soldOutState;
	State noCoinState;
	State hasCoinState;
	State soldState;

	int countOfNickel;
	int countOfDime;
	int countOfQuarter;
	int typeOfMachine;



	State state = soldOutState;
	int countOfBalls = 0;

	public GumballMachine(int numberOfGumballs) {
		soldOutState = new SoldOutState(this);
		noCoinState = new NoCoinState(this);
		hasCoinState = new HasCoinState(this);
		soldState = new SoldState(this);

		countOfNickel = 0;
		countOfDime = 0;
		countOfQuarter = 0;
		typeOfMachine = 0;

		this.countOfBalls = numberOfGumballs;
		if (numberOfGumballs > 0) {
			state = noCoinState;
		}
	}

	public void insertCoin(int coin) {
		if (coin == 25) {
			++countOfQuarter;
			System.out.println("Inserted a Quarter");
		} else if (coin == 5) {
			++countOfNickel;
			System.out.println("Inserted a Nickel");
		} else if (coin == 10) {
			++countOfDime;
			System.out.println("Inserted a Dime");
		}
		state.insertCoin(coin);
	}

	public void ejectCoin() {
		state.ejectCoin();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}

	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (countOfBalls != 0) {
			countOfBalls = countOfBalls - 1;
		}
	}

	int getCountOfBalls() {
		return countOfBalls;
	}
	void setCountOfBalls(int c) {
		this.countOfBalls = c ;
	}

	
	int getCountOfNickel() {
		return countOfNickel;
	}
	int getCountOfdime() {
		return countOfDime;
	}
	int getCountOfQuarter() {
		return countOfQuarter;
	}

	int getTypeOfMachine() {
		return typeOfMachine;
	}
	void setCountOfNickel(int countOfNickel) {
		this.countOfNickel= countOfNickel;
	}
	void setCountOfdime(int countOfDime ) {
		this.countOfDime= countOfDime;
	}
	void setCountOfQuarter(int countOfQuarter) {
		this.countOfQuarter= countOfQuarter;
	}

	void setTypeOfMachine(int typeOfMachine) {
		this.typeOfMachine =typeOfMachine;
	}

	void refill(int countOfBalls) {
		this.countOfBalls = countOfBalls;
		state = noCoinState;
	}

	public State getState() {
		return state;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoCoinState() {
		return noCoinState;
	}

	public State getHasCoinState() {
		return hasCoinState;
	}

	public State getSoldState() {
		return soldState;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + countOfBalls + " gumball");
		if (countOfBalls != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
