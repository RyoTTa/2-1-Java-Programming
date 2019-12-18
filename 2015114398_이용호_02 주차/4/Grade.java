import java.util.Scanner;

public class Grade {

	public static void main(String args[]){
		
		int jum=0;
		Scanner input = new Scanner(System.in);
		
		System.out.printf("학생의 점수를 입력하시오:");
		jum=input.nextInt();
		
		if(jum>=90){
			System.out.printf("%d점이면 A학점입니다.",jum);
		}
		else if(jum>=80&&jum<90){
			System.out.printf("%d점이면 B학점입니다.",jum);
		}
		else if(jum>=70&&jum<80){
			System.out.printf("%d점이면 C학점입니다.",jum);
		}
		else if(jum>=60&&jum<70){
			System.out.printf("%d점이면 D학점입니다.",jum);
		}
		else {
			System.out.printf("%d점이면 F학점입니다.",jum);
		}
	}
}
