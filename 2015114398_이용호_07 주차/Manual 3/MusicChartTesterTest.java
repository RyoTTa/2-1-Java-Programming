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
		Music mu = new Music ("ÈïºÎÀü",1700);
		mc.add(mu);
		assertEquals("Test Music Add",1,mc.getMusicList().size(),0);
	}
	@Test
	public void testAddPolyMorphics(){
		Music mu =new Music("ÈïºÎÀü",1700);
		Classic cl=new Classic("»ç°è",1723,"ºñ¹ßµð");
		Pop po=new Pop("¼Ò³à½Ã´ë",1989,"ÀÌ½ÂÃ¶");
		
		mc.add(mu);
		mc.add(cl);
		mc.add(po);
		assertEquals("Test Polymorphism",3,mc.getMusicList().size(),0);
	}
}
