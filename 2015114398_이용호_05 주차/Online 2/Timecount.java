import T.Time;
import java.util.Scanner;

public class Timecount {
	
	public static void main(String args[]){
		
		int time=0;
		
		Scanner input=new Scanner(System.in);
		Time ti= new Time();
		
		System.out.print("초 입력:");
		time=input.nextInt();
		ti.setTime(time);
		
		System.out.printf("%d 초는 %d분 입니다.\n",time,ti.getMinutes());
		System.out.printf("%d 초는 %d시간 입니다.\n",time,ti.getHours());
		System.out.printf("%d 초는 %d일 입니다.\n",time,ti.getDays());
		System.out.println(ti.getTime());
	}
}
