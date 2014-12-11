import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Problem10Test {

	private Problem10 problem;

	@Before
	public void setUp() throws Exception {

		problem = new Problem10();
	}

	@Test
	public void testIsPrimeNumber() throws Exception {

		assertTrue( Problem10.isPrimeNumber( 2 ) );
		assertTrue( Problem10.isPrimeNumber( 3 ) );
		assertTrue( Problem10.isPrimeNumber( 13 ) );
		assertTrue( Problem10.isPrimeNumber( 23 ) );

		assertFalse( Problem10.isPrimeNumber( 1 ) );
		assertFalse( Problem10.isPrimeNumber( 4 ) );
		assertFalse( Problem10.isPrimeNumber( 9 ) );
		assertFalse( Problem10.isPrimeNumber( 50 ) );
	}

	@Test
	public void testGetPrimeNumberAt() throws Exception {

		assertEquals( 2, problem.getPrimeNumberAt( 1 ) );
		assertEquals( 3, problem.getPrimeNumberAt( 2 ) );
		assertEquals( 13, problem.getPrimeNumberAt( 6 ) );
		assertEquals( 29, problem.getPrimeNumberAt( 10 ) );
		assertEquals( 104743, problem.getPrimeNumberAt( 10001 ) );
	}

	@Test
	public void testGetSumOfPrimeNumberEqualOrLessThan() throws Exception {

		assertEquals( 17, problem.getSumOfPrimeNumberEqualOrLessThan( 10 ) );
		assertEquals( 28, problem.getSumOfPrimeNumberEqualOrLessThan( 11 ) );
		assertEquals( 77, problem.getSumOfPrimeNumberEqualOrLessThan( 20 ) );
		assertEquals( 142913828922l, problem.getSumOfPrimeNumberEqualOrLessThan( 2000000 ) );
	}

}
