package Problem1;

public class InvalidAmountArgument extends Exception {

	public InvalidAmountArgument(double negetive_amount) {

		super("Invalid Amount Value" + Double.toString(negetive_amount));

	}

}
