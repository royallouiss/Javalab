class Account {

	final double MIN_BALANCE = 1000;

	void displaybalance() {

	System.out.print("Minimum balance : " + MIN_BALANCE);


	}

}

class Final {

	public static void main(String[] args) {

	Account a = new Account();

	a.displaybalance();

	}

}