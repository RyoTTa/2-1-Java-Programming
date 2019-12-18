import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JUnitZipTest {

	@Test
	public void testZip() {
		Zip myzip = new Zip();
		String myString;
		myString=myzip.myZip("가나다다다다다다라라라마바사아아아자자자차차차카타파파");
		assertEquals("Zip Test","가1나1다6라3마1바1사1아3자3차3카1타1파2",myString);
	}
	@Test
	public void testUnZip() {
		Zip myzip = new Zip();
		String myString;
		myString=myzip.myUnZip("파6타2카1자3아2사1가4");
		assertEquals("UnZip Test","파파파파파파타타카자자자아아사가가가가",myString);
	}
	@Test
	public void testZipUnZip() {
		Zip myzip = new Zip();
		String text="가가가가가가가나나다라바마마마마마봐라";
		String compressed = myzip.myZip(text);
		String uncompressed = myzip.myUnZip(compressed);
		assertEquals("ZipUnZip Test",uncompressed,text);
	}

}
