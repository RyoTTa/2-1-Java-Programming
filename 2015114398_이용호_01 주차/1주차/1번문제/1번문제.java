import java.util.Scanner;

public class onemain {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int sum1, sum2;
		
		System.out.printf("Enter two integers : ");
		
		sum1=input.nextInt();
		sum2=input.nextInt();
		
		if(sum1%sum2==0){
			System.out.printf("%d는 %d의 배수입니다",sum1,sum2);
		}
		else{
			System.out.printf("%d는 %d의 배수가 아닙니다",sum1,sum2);
		}
		
	}
	
}
