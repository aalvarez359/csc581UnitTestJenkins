package com.armando.alvarez.csc581_unit_test_jenkins;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathUtilsTest {

	/*@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	private MathUtils mathutilsObj;

	@Before
	public void setUp() throws Exception {
		mathutilsObj = new MathUtils();
	}

	@Test
	public void addTest() {
		assertEquals(6, mathutilsObj.add(3, 3));
		assertEquals(103, mathutilsObj.add(0, 103));
		assertEquals(6, mathutilsObj.add(-6, 12));
		assertEquals(-18, mathutilsObj.add(-6, -12));
	}
	@Test
	public void subtractTest() {
		assertEquals(0, mathutilsObj.subtract(3, 3));
		assertEquals(-103, mathutilsObj.subtract(0, 103));
		assertEquals(-18, mathutilsObj.subtract(-6, 12));
		assertEquals(6, mathutilsObj.subtract(-6, -12));
	}
	@Test
	public void multiplyTest() {
		assertEquals(9, mathutilsObj.multiply(3, 3));
		assertEquals(0, mathutilsObj.multiply(0, 103));
		assertEquals(-6, mathutilsObj.multiply(-6, 1));
		assertEquals(6, mathutilsObj.multiply(-6, -1));
	}
	@Test
	public void divideTest() {
		assertEquals(-1.0, mathutilsObj.divide(3, 0), 0.000001);
		assertEquals(0.0, mathutilsObj.divide(0, 103), 0.000001);
		assertEquals(4.0, mathutilsObj.divide(12, 3), 0.000001);
		assertEquals(-2.0, mathutilsObj.divide(-2, 1), 0.000001);
		assertEquals(0.0, mathutilsObj.divide(-6, -36), 0.000001);
	}
}
