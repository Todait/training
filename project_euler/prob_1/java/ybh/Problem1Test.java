import junit.framework.TestCase;

public class Problem1Test extends TestCase {

	public void testMulipleOfNumber() throws Exception {

		assertFalse( Problem1.isMultipleOfNumber( 0, 1 ) );
		assertFalse( Problem1.isMultipleOfNumber( 10, 3 ) );
		assertTrue( Problem1.isMultipleOfNumber( 15, 3 ) );
		assertFalse( Problem1.isMultipleOfNumber( 31, 3 ) );
		assertTrue( Problem1.isMultipleOfNumber( 30, 5 ) );
		assertFalse( Problem1.isMultipleOfNumber( 3, 5 ) );
		assertTrue( Problem1.isMultipleOfNumber( 5, 5 ) );
		assertTrue( Problem1.isMultipleOfNumber( 10, 5 ) );
		assertTrue( Problem1.isMultipleOfNumber( 15, 5 ) );
	}

	public void testSumOf3And5MultipleUnder() throws Exception {

		assertEquals( 23, Problem1.getSumOf3And5MultipleUnder( 10 ) );
		assertEquals( 45, Problem1.getSumOf3And5MultipleUnder( 15 ) );
		assertEquals( 195, Problem1.getSumOf3And5MultipleUnder( 30 ) );
		assertEquals( 233168, Problem1.getSumOf3And5MultipleUnder( 1000 ) );
	}

}
