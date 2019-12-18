
public class MusicChartInterfaceTester {

	public static void main(String[] args){
		MusicChart musicChart = new MusicChart();
		
		musicChart.add(new Music("흥부전",1700));
		musicChart.add(new Classic("사계",1732,"비발디"));
		musicChart.add(new Classic("합창",1824,"베토벤"));
		musicChart.add(new Pop("Tell me",2007,"원더걸스"));
		musicChart.add(new Pop("소녀시대",1989,"이승철"));
		
		for(Music music:musicChart.getMusicList()){
			music.play();
		}
	}
}

class MusicChart{
	
	Music[] musicList=new Music[5];
	int count=0;
	
	public void add(Music newMusic){
		musicList[count]=newMusic;
		count++;
	}
	@Override
	public String toString(){
		
		String output;
		int i;
		
		output=String.format("%s", musicList[0].toString());
		for(i=1;i<count;i++){
			output=String.format(output+"%s", musicList[i].toString());
		}
		return output;
	}
	public Music[] getMusicList(){
		
		return musicList;
	}
}

interface Playable{
	public void play();
}

class Music implements Playable{
	
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
		
		return String.format("%s %s%s, %s%d%s\n","Music","[곡명=",name,"연도=",year,"]");
	}
	public void play(){
		System.out.printf("Music '%s'을(를) 연주합니다.\n",name);
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
		
		return String.format("%s %s%s, %s%d, %s%s%s\n","Classic","[곡명=",name,"연도=",year,"작곡가=",com,"]");
	}
	@Override
	public void play(){
		System.out.printf("Classic '%s'을(를) 연주합니다.\n",name);
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
		
		return String.format("%s %s%s, %s%d, %s%s%s\n","Pop","[곡명=",name,"연도=",year,"가수=",sing,"]");
	}
	@Override
	public void play(){
		System.out.printf("Pop '%s'을(를) 연주합니다.\n",name);
	}
}