import java.util.Scanner;

public class Ncr {
	
	public static void main(String args[]){
		
		int L,R;
		long fact;
		Scanner input=new Scanner(System.in);
		
		L=input.nextInt();
		R=input.nextInt();
		
		fact=Fact(L,R);
	
		System.out.printf("%d\n", fact);
	}
	
	public static long Fact2(int temp, int num, int r){
		if(num == 0) return 1;
		else if(num == 1) return 1;
		else if(num == (temp-r+1)) return num;
		else{
			return Fact2(temp, num-1, r) * num;
		}
	}
	public static long Fact(int L,int R){
		
		long combine;
		if(L<R) return -1;
		else{
			combine = Fact2(L, L, R) / Fact2(R, R, 0);
		}
		return combine;
	}
	
	
}
