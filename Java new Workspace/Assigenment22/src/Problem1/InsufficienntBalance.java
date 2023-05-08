package Problem1;

public class InsufficienntBalance extends Exception {
	

	public InsufficienntBalance(double currentbalance, double WithdrawAmount) {
		super( "Current balance" + Double.toString(currentbalance) + "is lower than the withdrawal amount "
				+ Double.toString(WithdrawAmount));
	}

	

}
