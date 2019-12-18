import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JUnitZipTest {

	@Test
	public void testZip() {
		Zip myzip = new Zip();
		String myString;
		myString=myzip.myZip("�����ٴٴٴٴٴٶ��󸶹ٻ�ƾƾ�������������īŸ����");
		assertEquals("Zip Test","��1��1��6��3��1��1��1��3��3��3ī1Ÿ1��2",myString);
	}
	@Test
	public void testUnZip() {
		Zip myzip = new Zip();
		String myString;
		myString=myzip.myUnZip("��6Ÿ2ī1��3��2��1��4");
		assertEquals("UnZip Test","������������ŸŸī�����ھƾƻ簡������",myString);
	}
	@Test
	public void testZipUnZip() {
		Zip myzip = new Zip();
		String text="�������������������ٶ�ٸ�������������";
		String compressed = myzip.myZip(text);
		String uncompressed = myzip.myUnZip(compressed);
		assertEquals("ZipUnZip Test",uncompressed,text);
	}

}
