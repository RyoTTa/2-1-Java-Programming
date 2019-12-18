import java.util.ArrayList;

public class StudentList {
	
	public static void main(String args[]){
		
		eg1();
	}
	static void eg1(){
		Student aaa=new Student();
		Student bbb=new Student(234567);
		Student ccc=new Student(345678,"길동");
		aaa.setID(123456);
		aaa.setName("전우치");
		aaa.setAllResult(7, 9, 7, 9, 6);
		bbb.setName("강감찬");
		bbb.setAllResult(7, 5, 1, 8, 8);
		ccc.setAllResult(8, 9, 8, 4, 8);
		aaa.print();
		bbb.print();
		ccc.print();
		aaa.setUpdate(0, 8);
		aaa.setUpdate(4, 7);
		bbb.setUpdate(2, 2);
		bbb.setUpdate(4, 1);
		ccc.setUpdate(1, 6);
		aaa.print();
		bbb.print();
		ccc.print();
	}
}
class Student{
	
	int id;
	String name;
	ArrayList<Integer> quizResult = new ArrayList<Integer>();
	double sum;
	
	public Student(){

	}
	public Student(int id){
		this(id,"NULL");
	}
	public Student(int id,String name){
		setName(name);
		setID(id);
	}
	public void setName(String name){
		this.name=name;
	}
	public void setID(int id){
		this.id=id;
	}
	void setAllResult(int a,int b,int c,int d,int e){
		quizResult.add(a);
		quizResult.add(b);
		quizResult.add(c);
		quizResult.add(d);
		quizResult.add(e);
	}
	void setUpdate(int index,int value){
		quizResult.remove(index);
		quizResult.add(index, value);
	}
	void print(){
		
		sum=0;
		System.out.printf("%d %s ",id,name);
		for(Integer quizResult:quizResult){
			System.out.printf("%d ",quizResult);
			sum=(double)(quizResult)+sum;
		}
		System.out.printf("(Tt %.0f, Av %.1f)\n",sum,sum/5.0);
	}
}