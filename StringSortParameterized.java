import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class StringSortParameterized {
	
	private String input;
	private String expected;
	
	public StringSortParameterized(String input, String expected) {
		
		this.input = input;
		this.expected = expected;
	}
	
	@Parameterized.Parameters
	public static Collection strings() {
		return Arrays.asList(new Object[][]{
			{ "ZYXW", "WXYZ"},
			{ "WXYZ", "WXYZ"},
			{ "X", "X"},
			{ "", ""}
		});
	}
	
	@Test
	public void testStringSort() {
		System.out.println("String is: " + input);
		assertEquals(expected, 
			      StringSort.sortStr(input));
	}
}
