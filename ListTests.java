import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
	@Test 
	public void testFilter() {
    List<String> input1 = new ArrayList<String>(); 
    list.add("hello"); 
    list.add("23"); 
    ListExamples.filter(input1, StringChecker);
    assertListEquals(new List<String>{ "hello" }, input1);
	}

/** 
  @Test
  public void testMerge() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test 
	public void testFilter2() {
    int[] input1 = { 1,2,3,4,5,6 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 6,5,4,3,2,1 }, input1);
	}

  @Test
  public void testMerge2() {
    int[] input1 = { 1,2,3,4,5,6 };
    assertArrayEquals(new int[]{ 6,5,4,3,2,1 }, ArrayExamples.reversed(input1));
  }
  */
}
