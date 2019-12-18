import java.util.Scanner;
public class Manual {

	public static void main (String[] args){
		
		System.out.println("Enter a number : ");
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		IntTriangle rt=new IntTriangle(num);
		rt.print();
	}
}
class IntTriangle{
	
	int num=0;
	
	public IntTriangle(int num){
		this.num=num;
	}
	public void print(){
		int i,j,count=0;
		
		for(i=this.num;i>0;i--){
			for(j=1;j<=this.num;j++){
				if(j>=i){
					
					System.out.printf("%d",j);
				}
				else{
					System.out.printf("0");
				}
			}
			System.out.println("");
		}
	}
}