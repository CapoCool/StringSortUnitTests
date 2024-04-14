import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringSortTest {
	@Test
	public void testID1() {
		
		assertEquals("WXYZ", StringSort.sortStr("ZYXW"));
	}
	
	@Test
	public void testID2() {
		
		assertEquals("WXYZ", StringSort.sortStr("WXYZ"));
	}
	
	@Test
	public void testID3() {
		
		assertEquals("X", StringSort.sortStr("X"));
	}
	
	@Test
	public void testID4() {
		
		assertEquals("", StringSort.sortStr(""));
	}
}
