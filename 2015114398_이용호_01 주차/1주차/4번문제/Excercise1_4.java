import javax.swing.JOptionPane;

public class Excercise1_4 {

	public static void main(String[] args) 
	{
		String name;
		String balance;
		String interest;
		double Rbalance;
		double Rinterest;
		
		name = JOptionPane.showInputDialog("예금주를 입력하세요");
		Account1 Account = new Account1(name);
		balance = JOptionPane.showInputDialog("잔액을 입력하세요");
		
		Rbalance = Double.parseDouble(balance);
		
		Account.setBalance(Rbalance);
		
		String print = String.format("예금주: %s\n잔액: %.1f", Account.getName(), Account.getBalance());
		JOptionPane.showMessageDialog(null, print);
		
		interest = JOptionPane.showInputDialog(print + "\n이자율을 입력하세요", print);
		Rinterest = Double.parseDouble(interest);
		Account.addInterest(Rinterest);
		
		print = String.format("예금주: %s\n잔액: %.1f", Account.getName(), Account.getBalance());
		
		JOptionPane.showMessageDialog(null, print);

	}

}
