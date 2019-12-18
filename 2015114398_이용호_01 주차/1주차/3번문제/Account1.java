public class Account1
{
	private String name;
	private double balance;

	public Account1(String name)
	{
		this.name=name;
	}

	public String getName()
	{ 
		return name;
	}

	public double getBalance()
	{  
		return balance;
	}

	public void setBalance(float balance)
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
}
