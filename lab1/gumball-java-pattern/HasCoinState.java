
/**
 * Write a description of class HasCoinState here.
 *
 * @author (Harsh Agrawal)
 * @version (Sept 8)
 */

import java.util.Random;

public class HasCoinState implements State {
    GumballMachine gumballMachine;
    int coinTotalAmount;

    public HasCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
        this.coinTotalAmount = 0;

    }

    public void insertCoin(int coin) {

        // System.out.println("You can't insert another quarter");
    }

    public void ejectCoin() {
        System.out.println("Coins returned");
        gumballMachine.setState(gumballMachine.getNoCoinState());
    }

    public void turnCrank() {
        System.out.println("You turned...");
        coinTotalAmount = this.gumballMachine.getCountOfNickel() * 5 + this.gumballMachine.getCountOfdime() * 10
                + this.gumballMachine.getCountOfQuarter() * 25;
        if (coinTotalAmount < 25) {
            System.out.println(" More cents needed");
            gumballMachine.ejectCoin();
        } else if ((this.gumballMachine.getCountOfNickel() > 0 || this.gumballMachine.getCountOfdime() > 0)
                && coinTotalAmount < 50) {
            System.out.println(" More cents needed");
            gumballMachine.ejectCoin();
            // System.out.println(coinTotalAmount / 50 + "gumball dispensed");
            // System.out.println(coinTotalAmount - (coinTotalAmount / 50) * 50 + "coins
            // returned");
        } else if (coinTotalAmount > 50) {
            coinTotalAmount = coinTotalAmount - 50;
            if (coinTotalAmount > 0) {
                System.out.println("Extra " + coinTotalAmount + " cents returned");
            }
            gumballMachine.setState(gumballMachine.getSoldState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public String toString() {
        return "waiting for turn of crank";
    }

}
