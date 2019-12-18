
public class test {

	public static void main(String[] args){
		
		Account1 account = new Account1("홍길동");
		account.setBalance(1000);
		account.print();
		
		account.addInterest(1.1);
		account.print();

	}
}
