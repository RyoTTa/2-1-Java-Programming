package T;


public class Time{

	int time;
	
	public void setTime(int t){
		this.time=t;
	}
	public int getMinutes(){
		
		return time/60;
	}
	public int getHours(){
		
		return time/3600;
	}
	public int getDays(){
		
		return time/86400;
	}
	public String getTime(){
		
		String clo;
		int sec=0,min=0,hou=0,day=0,temp=0;;
		
		day=time/86400;
		temp=time%86400;
		hou=temp/3600;
		temp=temp%3600;
		min=temp/60;
		temp=temp%60;
		sec=temp;
		
		clo=time+" 초는 "+day+"일 "+hou+"시간 "+min+"분 "+sec+"초 입니다.";
		
		return clo;
	}

}
