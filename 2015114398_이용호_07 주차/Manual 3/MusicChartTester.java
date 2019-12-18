import java.util.ArrayList;

public class MusicChartTester {

	public static void main(String[] args){
		MusicChart musicChart = new MusicChart();
		
		musicChart.add(new Music("�����",1700));
		musicChart.add(new Classic("ĳ��",1732,"���ۺ�"));
		musicChart.add(new Classic("���",1810,"���亥"));
		musicChart.add(new Pop("�ٶ��̺д�",2004,"�̼Ҷ�"));
		musicChart.add(new Pop("P.S. I love you",1998,"������"));
		
		System.out.println(musicChart);
	}
}

class MusicChart{
	
	ArrayList<Music> musicList;
	public MusicChart(){
		musicList = new ArrayList<Music>();
	}
	public void add(Music item){
		musicList.add(item);
	}
	
	public String toString(){
		String print="";
		for(int i=0; i<musicList.size(); i++){
			print+=musicList.get(i)+"\n";
		}
		
		return print;
	}
	public ArrayList<Music> getMusicList(){
		return musicList;
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
		
		return String.format("%s %s%s, %s%d%s","Music","[���=",name,"����=",year,"]");
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
		
		return String.format("%s %s%s, %s%d, %s%s%s","Classic","[���=",name,"����=",year,"�۰=",com,"]");
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
		
		return String.format("%s %s%s, %s%d, %s%s%s","Pop","[���=",name,"����=",year,"����=",sing,"]");
	}
}