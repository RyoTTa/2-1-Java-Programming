public class Account2
{
	private String name;
	private double balance;

	public String getName()
	{ 
		return name;
	}

	public double getBalance()
	{  
		return balance;
	}

	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	
	public void print()
	{
		System.out.printf("예금주 : %s\n",name);
		System.out.printf("잔액 : %.1f\n\n",balance);
	}
	
	public void addInterest(double interestRates)
	{  
		balance=balance*interestRates;
	}
	
	public Account2(){
		balance=0;
	}
	
	void withdraw(double amount){
		balance=balance-amount;
	}
	
	String tostring(){
		String str = ("Balance:"+balance);
		return str;
		
	}
public static void main(String args[]){
		
		Account2 account = new Account2();
		account.setBalance(1000.0);
		System.out.println(account.tostring());
		
		account.withdraw(500.0);
		System.out.println(account.tostring());
	}
}

