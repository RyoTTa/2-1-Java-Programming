import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CalculatorTest{
		Calculator cal;
		@Before
		public void setUp() throws Exception{
			cal = new Calculator();        	}
		@Test
		public void add_test()	{
			assertEquals("100.0", cal.add("100"));
			assertEquals("200.0", cal.add("100"));
			assertEquals("150.0", cal.add("-50"));
			assertEquals("150.0", cal.add("0"));
			assertEquals("157.5", cal.add("7.5"));  
		}
		@Test
		public void sub_test() 	{
			assertEquals("-100.0", cal.sub("100"));
			assertEquals("-200.0", cal.sub("100"));
			assertEquals("-150.0", cal.sub("-50"));
			assertEquals("-150.0", cal.sub("0"));
			assertEquals("-157.5", cal.sub("7.5")); 
		}
		@Test
		public void mul_test() {
			assertEquals("0.0", cal.mul("5"));
			assertEquals("10.0", cal.add("10"));
			assertEquals("20.0", cal.mul("2"));
			assertEquals("-50.0", cal.mul("-2.5"));
			assertEquals("-0.0", cal.mul("0"));   
		}
		@Test
		public void div_test() {
			assertEquals("100.0", cal.add("100"));
			assertEquals("20.0", cal.div("5"));
			assertEquals("8.0", cal.div("2.5"));
			assertEquals("-1.6", cal.div("-5"));
			assertEquals("Cannot be divided by zero", cal.div("0"));
			assertEquals("0.0", cal.div("1"));     
		}
		@Test
		public void equal_test() {
			assertEquals("0.0", cal.equal());
			assertEquals("100.0", cal.add("100"));
			assertEquals("100.0", cal.equal());  
		}  
}


