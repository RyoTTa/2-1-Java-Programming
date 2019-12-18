import java.util.Scanner;
import java.util.Random;

public class Count {

	public static void main(String args[]){
		
		int c,i,call=0;
		int rcount=0,ccount=0,pcount=0;
		
		Scanner input=new Scanner(System.in);
		Random randomNumbers=new Random();
		
		System.out.printf("가위바위보를 몇 번 할까요?");
		c=input.nextInt();
		System.out.println("가위바위보 총 횟수 = "+c);
		
		for(i=0;i<c;i++){
			call=1+randomNumbers.nextInt(3);
			
			if(call==1){
				rcount++;
			}
			else if(call==2){
				ccount++;
			}
			else{
				pcount++;
			}
		}
		System.out.println("가위 : "+rcount);
		System.out.println("바위 : "+ccount);
		System.out.println("보 : "+pcount);
	}
}
