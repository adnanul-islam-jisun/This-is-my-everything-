package Problem1;

public class Account {
	String name;
	double balance = 0;

	public void withdraw(double amount) throws InvalidAmountArgument, InsufficienntBalance {

		if (amount < 0) {
			throw new InvalidAmountArgument(amount);
		}
		if (balance < amount) {
			throw new InsufficienntBalance(balance, amount);
		}

		balance = (balance - amount);

	}

	public void deposit(double amount) throws InvalidAmountArgument {

		if (amount < 0) {
			throw new InvalidAmountArgument(amount);
		}
		balance = balance + amount;
	}

}
