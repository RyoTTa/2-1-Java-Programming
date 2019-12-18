import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class MusicChartTesterTest {

	MusicChart mc;
	@Before
	public void setUp()throws Exception{
		mc=new MusicChart();
	}
	@Test
	public void testAddMusic(){
		Music mu = new Music ("�����",1700);
		mc.add(mu);
		assertEquals("Test Music Add",1,mc.getMusicList().size(),0);
	}
	@Test
	public void testAddPolyMorphics(){
		Music mu =new Music("�����",1700);
		Classic cl=new Classic("���",1723,"��ߵ�");
		Pop po=new Pop("�ҳ�ô�",1989,"�̽�ö");
		
		mc.add(mu);
		mc.add(cl);
		mc.add(po);
		assertEquals("Test Polymorphism",3,mc.getMusicList().size(),0);
	}
}
