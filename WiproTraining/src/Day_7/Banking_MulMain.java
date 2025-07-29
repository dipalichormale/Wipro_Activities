package Day_7;

public class Banking_MulMain {

	public static void main(String[] args) throws InterruptedException {
		Bank_mul account = new Bank_mul(1000.0);
		Thread t1 = new Thread(() -> {
			for(int i=0;i<3;i++) {
				account.deposit(200.0);
				sleep(100);
			}
		}, "Deposit-Thread");
		
		Thread t2 = new Thread(() -> {
			for(int i=0;i<3;i++) {
				account.withdraw(150.0);
				sleep(20);
			}
		}, "Withdraw-Thread");
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.printf("Final Balance = %.2f%n", account.getBalance());
	}
	private static void sleep(int mills) {
		try {
			Thread.sleep(mills);
		}catch(InterruptedException ignored) {
			
		}
	}

}
