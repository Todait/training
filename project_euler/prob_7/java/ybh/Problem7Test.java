import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Problem7Test {

	@Test
	public void testIsPrimeNumber() throws Exception {

		assertTrue( Problem7.isPrimeNumber( 2 ) );
		assertTrue( Problem7.isPrimeNumber( 3 ) );
		assertTrue( Problem7.isPrimeNumber( 13 ) );
		assertTrue( Problem7.isPrimeNumber( 23 ) );

		assertFalse( Problem7.isPrimeNumber( 1 ) );
		assertFalse( Problem7.isPrimeNumber( 4 ) );
		assertFalse( Problem7.isPrimeNumber( 9 ) );
		assertFalse( Problem7.isPrimeNumber( 50 ) );
	}

	@Test
	public void testGetPrimeNumberAt() throws Exception {

		assertEquals( 2, Problem7.getPrimeNumberAt( 1 ) );
		assertEquals( 3, Problem7.getPrimeNumberAt( 2 ) );
		assertEquals( 13, Problem7.getPrimeNumberAt( 6 ) );
		assertEquals( 29, Problem7.getPrimeNumberAt( 10 ) );
		assertEquals( 104743, Problem7.getPrimeNumberAt( 10001 ) );
	}

}
