
public class MusicTester {

	public static void main(String[] args){
		
		Music m=new Music("흥부전",1700);
		Classic c=new Classic("캐논",1732,"파핼벨");
		Pop p=new Pop("바람이 분다",2004,"이소라");
		
		System.out.println(m);
		System.out.println(c);
		System.out.println(p);
	}
}
class Music{
	
	private String name;
	private int year;
	
	public Music(String name,int year){
		this.name=name;
		this.year=year;
	}
	public String getName(){
		return name;
	}
	public int getYear(){
		return year;
	}
	@Override
	public String toString(){
		
		return String.format("%s %s%s, %s%d%s","Music","[곡명=",name,"연도=",year,"]");
	}
}
class Classic extends Music{
	
	private String name;
	private int year;
	private String com;
	public Classic(String name,int year,String com){
		super(name,year);
		this.name=name;
		this.year=year;
		this.com=com;
	}
	public String getCom(){
		return com;
	}
	@Override
	public String toString(){
		
		return String.format("%s %s%s, %s%d, %s%s%s","Classic","[곡명=",name,"연도=",year,"작곡가=",com,"]");
	}
}

class Pop extends Music{
	
	private String name;
	private int year;
	private String sing;
	public Pop(String name,int year,String sing){
		super(name,year);
		this.name=name;
		this.year=year;
		this.sing=sing;
	}
	public String getSing(){
		return sing;
	}
	@Override
	public String toString(){
		
		return String.format("%s %s%s, %s%d, %s%s%s","Pop","[곡명=",name,"연도=",year,"가수=",sing,"]");
	}
}