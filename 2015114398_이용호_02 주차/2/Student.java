import java.util.Scanner;

public class Student {

	public static void main(String args[]){
		
		double count=0;
		double sum=0;
		int i=1;
		Scanner input=new Scanner(System.in);
		
		while(count>=0){
			System.out.printf("학생의 점수를 입력하시오:");
			count=input.nextDouble();
			if(count<=-1){
				break;
			}
			sum=sum+count;
			i++;
		}
		i--;
		System.out.printf("점수의 합계:%.0f\n",sum);
		System.out.printf("점수의 평균:%.2f",sum/(double)i);
	}
}
