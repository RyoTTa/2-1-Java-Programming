
public class TestSync implements Runnable{

	private int balance;
	public synchronized void increment(){
		int tmp = balance;
		System.out.toString();
		balance = tmp+1;
	}
	@Override
	public synchronized void run(){
		for(int i=0;i<200;i++){
			increment();
		}
		System.out.println("Balance is " + balance);
	}
	
	public synchronized int getBalance(){
		return balance;
	}
}
