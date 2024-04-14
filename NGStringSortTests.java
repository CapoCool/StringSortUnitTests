import org.testng.Assert;
import org.testng.annotations.Test;

public class NGStringSortTests {
  @Test
  public void t1() {
	  System.out.println("t1");
	  Assert.assertEquals("WXYZ", StringSort.sortStr("ZYXW"));
  }
  
  @Test
  public void t2() {
	  System.out.println("t2");
	  Assert.assertEquals("WXYZ", StringSort.sortStr("WXYZ"));
  }
  
  @Test
  public void t3() {
	  System.out.println("t3");
	  Assert.assertEquals("X", StringSort.sortStr("X"));
  }
  
  @Test
  public void t4() {
	  System.out.println("t4");
	  Assert.assertEquals("", StringSort.sortStr(""));
  }
}
