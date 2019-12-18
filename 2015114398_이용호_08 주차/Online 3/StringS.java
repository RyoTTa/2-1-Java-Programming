
public class StringS {

	public static void main(String[] args){
		String text1 = "가가가가가가가나나나다라라라라나나마마마마마바바사아가가";
		Zip z= new Zip();
		String text2=z.myZip(text1);
		String text3=z.myUnZip(text2);
		System.out.println("/*** original ***/");
		System.out.println(text1);
		System.out.println("\n/*** zip ***/");
		System.out.println(text2);
		System.out.println("\n/*** unzip ***/");
		System.out.println(text3);

	}
}
class Zip{
	
	public String myZip(String text){
		char[] charArray = new char[text.length()];
		String output="";
		char token;
		int count=0;;
		text.getChars(0, text.length(), charArray,0);
		
		token=charArray[0];
		for(char ch:charArray){
			if(token==ch){
				count++;
			}
			else{
				output=output.format(output+"%c%d",token,count);
				count=1;
				token=ch;
			}
		}
		output=output.format(output+"%c%d",token,count);
		return output;
	}
	public String myUnZip(String text){
		
		String output="";
		char[] charArray=new char[text.length()];
		char token;
		int i=0,count,j=0;
		
		text.getChars(0, text.length(), charArray, 0);
		
		for(i=0;i<text.length();i=i+2){
			token=charArray[i];
			count=charArray[i+1]-'0';
			for(j=0;j<count;j++){
				output=output.format(output+"%c",token);
			}
		}
		
		return output;
	}

}