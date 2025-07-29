package Day_7;

public class Bank_mul {
	private double balance;
	
	public Bank_mul(double initialBalance) {
		this.balance = initialBalance;
	}
	
	public synchronized void deposit(double amount) {
		balance += amount;
		System.out.printf("%s deposited: %.2f, Balance: %.2f%n", 
				Thread.currentThread().getName(), amount, balance);
	}
	public synchronized void withdraw(double amount) {
		if(balance >= amount) {
		   balance -=  amount;
		   System.out.printf("%s withdraw: %.2f, Balance: %.2f%n", 
				Thread.currentThread().getName(), amount, balance);
		} else {
			 System.out.printf("%s: Insufficient funds for withdrawing %.2f, Balance: %.2f%n", 
						Thread.currentThread().getName(), amount, balance);
		}
	}
	public double getBalance() {
		return balance;
	}

}
