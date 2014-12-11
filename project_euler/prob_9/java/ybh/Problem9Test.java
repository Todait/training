import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem9Test {

	@Test
	public void testIsPythagorasNums() throws Exception {

		assertEquals( true, Problem9.isPythagorasNums( 3, 4, 5 ) );
		assertEquals( false, Problem9.isPythagorasNums( 3, 4, 8 ) );
	}

	@Test
	public void testGetAnswer() throws Exception {

		assertEquals( 31875000, Problem9.getAnswer() );
	}

}
