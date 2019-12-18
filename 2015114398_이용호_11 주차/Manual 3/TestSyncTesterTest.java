import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSyncTesterTest {

	TestSyncTester tester;
	
	@Before
	public void setUp()throws Exception{
		tester = new TestSyncTester();
	}
	@Test
	public void testTestSyncTester(){
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException exception){
			exception.printStackTrace();
		}
		
		assertEquals(1000,tester.getTestSyncBalance());
	}

}
