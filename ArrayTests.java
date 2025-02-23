import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

	@Test 
	public void testReverseInPlace1() {
    int[] input1 = { 2, 4, 6 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 6, 4, 2 }, input1);
	}

  @Test
  public void testReversed1() {
    int[] input1 = { 1, 3, 5 };
    assertArrayEquals(new int[]{ 5, 3, 1 }, ArrayExamples.reversed(input1));
  }

}
