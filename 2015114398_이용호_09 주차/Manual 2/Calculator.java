
public class Calculator{
	double result = 0;
	
	public String add(String num){
		result = result + Double.parseDouble(num);
		return Double.toString(result); 
	}
	public String sub(String num){
		result = result - Double.parseDouble(num);
		return Double.toString(result); 
	}
	public String mul(String num){
		result = result * Double.parseDouble(num);
		return Double.toString(result); 
	}
	public String div(String num){
		double input = Double.parseDouble(num);
		String error;
		if(input==0){
			error = "Cannot be divided by zero";
			result = 0;
		}
		else{
			result = result / Double.parseDouble(num);
			error = Double.toString(result);
		}
		return error; 
	}
	public String equal(){
		return Double.toString(result); 
	}
}


