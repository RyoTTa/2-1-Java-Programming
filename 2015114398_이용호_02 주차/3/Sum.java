import java.util.Scanner;

public class Sum {

	public static void main(String args[]){
		
		int i=0,sum=0,j=0;
		Scanner input=new Scanner(System.in);
		System.out.printf("1부터 몇까지의 합을 구해볼까?");
		i=input.nextInt();
		
		for(j=1;j<=i;j++){
			sum=j+sum;
		}
		System.out.printf("1부터 %d까지의 합은 %d이다.",i,sum);
	}
}
