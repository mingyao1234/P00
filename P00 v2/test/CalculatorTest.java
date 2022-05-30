import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Quah Ming Yao
 * Student ID: 21023135
 * Class: W64N
 * Date/Time created: Monday 30-05-2022 09:46
 */

/**
 * @author MY_NB
 *
 */
public class CalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		int expected = 9999;
		assertEquals(expected, actual);
	}
	@Test
	public void testSubtract() {
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		int expected = 5555;
		assertEquals(actual, expected);
	}
	@Test
	public void testMultiply() {
		int a = 2;
		int b = 6;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		int expected = 12;
		assertEquals(actual, expected);
	}
	@Test
	public void testDivide() {
		int a = 6;
		int b = 2;
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		int expected = 3;
		assertEquals(actual, expected)
	}
}
