import T.Time;
import java.util.Scanner;

public class Timecount {
	
	public static void main(String args[]){
		
		int time=0;
		
		Scanner input=new Scanner(System.in);
		Time ti= new Time();
		
		System.out.print("�� �Է�:");
		time=input.nextInt();
		ti.setTime(time);
		
		System.out.printf("%d �ʴ� %d�� �Դϴ�.\n",time,ti.getMinutes());
		System.out.printf("%d �ʴ� %d�ð� �Դϴ�.\n",time,ti.getHours());
		System.out.printf("%d �ʴ� %d�� �Դϴ�.\n",time,ti.getDays());
		System.out.println(ti.getTime());
	}
}
