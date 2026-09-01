class BankAccount {

	private String holderName;

	private double balance;

	public void setAccount(String name, double amount) {

		holderName = name;

		balance = amount;

	}

	
	void deposit(double amount) {

		balance += amount;

		}


	void display() {
		
		System.out.println("Name : " + holderName + "\n balance : " + balance);

		}

}


public class Bankac { 

	public static void main(String[] args) {

		BankAccount b1 = new BankAccount();

		b1.setAccount("Aljo", 2000);

		b1.deposit(5000);

		b1.display();

	}
}
		