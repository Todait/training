import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Problem4Test {

	@Test
	public void testIsPalindrome() throws Exception {

		assertTrue( Problem4.isPalindrome( 4 ) );
		assertTrue( Problem4.isPalindrome( 11 ) );
		assertTrue( Problem4.isPalindrome( 9009 ) );
		assertTrue( Problem4.isPalindrome( 923329 ) );

		assertFalse( Problem4.isPalindrome( 10 ) );
		assertFalse( Problem4.isPalindrome( 23 ) );
		assertFalse( Problem4.isPalindrome( 235 ) );
		assertFalse( Problem4.isPalindrome( 39302 ) );
	}

	@Test
	public void testGetMaxPalindrome() throws Exception {

		assertEquals( 9009, Problem4.getMaxPalindrome( 2 ) );
		assertEquals( 9009, Problem4.getMaxPalindrome( 3 ) );
	}

}
