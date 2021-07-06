package ad.learning.threads;

class Account{
	int balance = 10000;
	
	synchronized void withdraw(int amount) {
		System.out.println("Trying to withdraw amount: " + amount);
		System.out.println("Balance: " + balance);
		if(balance < amount) {
			System.out.println("Low balance... waiting for deposit...");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		balance = balance - amount;
		System.out.println("Withdraw success! Available balance: " + balance);
	}
	
	synchronized void deposit(int amount) {
		balance = balance + amount;
		System.out.println("Deposit complete! Available balance: " + balance);
		
		this.notify();
	}
}

public class ThreadWaitNotifyExample {
	public static void main(String args[]) {
		Account account = new Account();
		Thread withdrawlThread = new Thread(() -> account.withdraw(15000));
		Thread depositThread = new Thread(() -> account.deposit(40000));
		
		withdrawlThread.start();
		depositThread.start();
		
	}
}
