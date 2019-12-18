import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args){
		Account account1 = new Account(50.00);
		Account account2 = new Account(-7.53);
		
		System.out.printf("account1 balance: $%.2f\n",account1.getBanlance());
		System.out.printf("account2 balance: $%.2f\n\n",account2.getBanlance());
	
		Scanner input = new Scanner(System.in);
		
		double depositAmount;
		System.out.printf("Enter deposit amount for account1: ");
		depositAmount =  input.nextDouble();
		System.out.printf("\nadding %.2f to account1 balance\n\n",depositAmount);
		account1.credit(depositAmount);
		
		System.out.printf("account1 balance: $%.2f\n",account1.getBanlance());
		System.out.printf("account2 balance: $%.2f\n\n",account2.getBanlance());

		System.out.printf("Enter deposit amount for account2: ",account2.getBanlance());
		depositAmount =  input.nextDouble();
		System.out.printf("\nadding %.2f to account2 balance\n\n",depositAmount);
		account2.credit(depositAmount);

		System.out.printf("account1 balance: $%.2f\n",account1.getBanlance());
		System.out.printf("account2 balance: $%.2f\n",account2.getBanlance());

	}
}
