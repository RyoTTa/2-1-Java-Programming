import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;


public class Handling {

	
	public static void main(String[] args){
		
		ArrayList<Integer> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int input=0;
		
		while(input!=-1){
			System.out.printf("Input:");
			input=scanner.nextInt();
			if(input!=-1){
				list.add(input);
			}
		}
		input=0;
		while(input!=-1){
			try{
				System.out.printf("Index:");
				input=scanner.nextInt();
				if(input==-1){
					break;
				}
				System.out.printf("Element at %d is %d\n", input,list.get(input));
			}
			catch(IndexOutOfBoundsException indexOutOfBoundsException){
				System.out.println("IndexOutOfBoundsException occurs");
			}
			finally{
				if(input!=-1){
					System.out.printf("This is the finally block\n");
				}
			}
		}
	}
}
