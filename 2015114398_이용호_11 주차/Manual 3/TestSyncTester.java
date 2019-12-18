
public class TestSyncTester {

	private TestSync p;
	private Thread a,b,c,d,e;
	
	public TestSyncTester(){
		p = new TestSync();
		a = new Thread(p);
		b = new Thread(p);
		c = new Thread(p);
		d = new Thread(p);
		e = new Thread(p);
		startThread();
	}
	public void startThread(){
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
	}
	public int getTestSyncBalance(){
		return p.getBalance();
	}
	public static void main(String[] args){
		new TestSyncTester();
	}
}

class TestSync implements Runnable{

	private int balance;
	
	public void increment(){
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
	
	public int getBalance(){
		return balance;
	}
}
