import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void findMaxTest1() {
		//fail("Not yet implemented");
		int[] arrA = {1,3,2,4};
		assertEquals("test if the biggest integer is  4", 4, HelloWorld.findMax(arrA));
	}
	@Test
	public final void findMaxTest2() {
		int[] arrB = {-11, -3, -1, -2, -4};
		assertEquals("test if the biggest integer is -1", -1, HelloWorld.findMax(arrB));
	}
}
