import java.util.ArrayList;
import java.util.Scanner;

public class ArrList {

	public static void main(String[] args){
		
		int push=0;
		int string;
		
		Scanner input=new Scanner(System.in);
		ArrayList<Integer> items=new ArrayList<Integer>();
		
		while(push!=5){
			System.out.println("�޴�");
			System.out.printf("1.Add 2.Remove 3.Print Position 4.Print All 5.Exit\n");
			System.out.printf("���� ����:");
			push=input.nextInt();
			
			switch(push){
			case 1 : 
				System.out.printf("�Է°�:");
				string=input.nextInt();
				if(!(items.contains(string))){
					items.add(string);
				}
				break;
			case 2 :
				System.out.printf("�Է°�:");
				string=input.nextInt();
				if((items.contains(string))){
					items.remove(string);
				}
				break;
			case 3 : 
				System.out.printf("�Է°�:");
				string=input.nextInt();
				if(string==items.size()){
					break;
				}
				if(string-1<items.size()){
					System.out.printf("��:%d\n",items.get(string));
				}
				break;
			case 4 :
				display(items,"��� ��:");
				break;
			case 5 :
			}
			
		}
	
	}
	public static void display(ArrayList<Integer>items,String header){
		
		System.out.print(header);
		int i=0;
		
		for(int item:items){
			if(i==0)
			{			
				System.out.printf("%s",item);
			}
			else{
				System.out.printf(" %s",item);
			}
			i++;
		}
		
		System.out.println();
	}
}
