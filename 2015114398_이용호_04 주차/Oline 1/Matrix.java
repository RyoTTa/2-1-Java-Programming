public class Matrix {

	public static void main(String args[]){
		
		int i=0,j=0,k=0;
		int count=0;
		char [][]c = {{'A','F','K','P','U'},{'B','G','L','Q','V'},{'C','H','M','R','W'},{'D','I','N','S','X'},{'E','J','O','T','Y'}};
		for(i=0;i<5;i++){
			for(j=0;j<5;j++){
				System.out.printf("%c",c[i][j]);
			}
			if(count!=4){
				System.out.printf("%n");
			}
			count++;
		}
	}
}
