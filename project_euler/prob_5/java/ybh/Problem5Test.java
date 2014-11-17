import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Problem5Test {

	@Test
	public void testGetLeastCommonMultipleOf() throws Exception {

		assertEquals( 1, Problem5.getLeastCommonMultipleOf( 1, 1 ) );
		assertEquals( 2, Problem5.getLeastCommonMultipleOf( 1, 2 ) );
		assertEquals( 2, Problem5.getLeastCommonMultipleOf( 2, 2 ) );
		assertEquals( 2, Problem5.getLeastCommonMultipleOf( 2, 1 ) );
		assertEquals( 10, Problem5.getLeastCommonMultipleOf( 2, 5 ) );
		assertEquals( 6, Problem5.getLeastCommonMultipleOf( 2, 6 ) );
		assertEquals( 24, Problem5.getLeastCommonMultipleOf( 6, 8 ) );
	}

	@Test
	public void testGetLeastCommonMultipleOf2() throws Exception {

		assertEquals( 1, Problem5.getLeastCommonMultipleOf( 1, 1, 1 ) );
		assertEquals( 60, Problem5.getLeastCommonMultipleOf( 1, 2, 3, 4, 5 ) );
		assertEquals( 2520, Problem5.getLeastCommonMultipleOf( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ) );
		assertEquals( 232792560, Problem5.getLeastCommonMultipleOf( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 ) );
	}

}
