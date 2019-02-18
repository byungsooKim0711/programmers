package org.kimbs.algorithms.palindrome;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class PalindromeTest {
	
	private static Palindrome p;
	
	@BeforeClass
	public static void setup() {
		p = new Palindrome();
	}

	@Test
	public void test() {
		// arrange
		// act
		// assert
	}

	@Test
	public void tc1PalindromeTest() {
		int length = p.solution("s");

		assertEquals(1, length);
	}

	@Test
	public void tc2PalindromeTest() {
		int length = p.solution("abcdcba");

		assertEquals(7, length);
	}

	@Test
	public void tc3PalindromeTest() {
		int length = p.solution("");

		assertEquals(0, length);
	}

	@Test
	public void tc4PalindromeTest() {
		int length = p.solution("abbbbbbbbbbbba");

		assertEquals(14, length);
	}

	@Test
	public void tc5PalindromeTest() {
		int length = p.solution("aoapoaot");

		assertEquals(3, length);
	}
}
