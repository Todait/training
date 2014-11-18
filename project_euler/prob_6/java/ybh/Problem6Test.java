import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem6Test {

	@Test
	public void testSumOfUnder() throws Exception {

		assertEquals( 1, Problem6.sumOfUnder( 1 ) );
		assertEquals( 3, Problem6.sumOfUnder( 2 ) );
		assertEquals( 15, Problem6.sumOfUnder( 5 ) );
		assertEquals( 55, Problem6.sumOfUnder( 10 ) );
		assertEquals( 66, Problem6.sumOfUnder( 11 ) );
	}

	@Test
	public void testGetAnswer() throws Exception {

		assertEquals( 170, Problem6.getAnswer( 5 ) );
		assertEquals( 2640, Problem6.getAnswer( 10 ) );
		assertEquals( 25164150, Problem6.getAnswer( 100 ) );
	}

}
