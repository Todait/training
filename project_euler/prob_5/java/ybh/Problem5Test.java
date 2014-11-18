import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


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
    public void testRemove1From() throws Exception {
        
        assertFalse( Problem5.remove1From( new int[]{1} ).contains( 1 ) );
        assertFalse( Problem5.remove1From( new int[]{1, 1, 1, 1} ).contains( 1 ) );
        assertFalse( Problem5.remove1From( new int[]{1, 4, 3, 5, 1, 3, 5, 6, 3} ).contains( 1 ) );
        assertFalse( Problem5.remove1From( new int[]{4, 3, 5, 3, 5, 6, 3} ).contains( 1 ) );
    }
    
    @Test
    public void testIsLessThanMax() throws Exception {
        
        assertTrue( Problem5.isLessThanMax( 4, Arrays.asList( 1, 3, 5, 3 ) ) );
        assertTrue( Problem5.isLessThanMax( 1, Arrays.asList( 1, 3, 5, 3 ) ) );
        
        assertFalse( Problem5.isLessThanMax( 5, Arrays.asList( 1, 3, 5, 3 ) ) );
        assertFalse( Problem5.isLessThanMax( 6, Arrays.asList( 1, 3, 5, 3 ) ) );
    }
    
    @Test
    public void testDivide() throws Exception {
        
        assertTrue( Problem5.divide( Arrays.asList( 3, 54, 1, 23 ), 3 ) );
        assertTrue( Problem5.divide( Arrays.asList( 3, 54, 1, 23 ), 1 ) );
        
        assertFalse( Problem5.divide( Arrays.asList( 3, 54, 1, 23 ), 5 ) );
        assertFalse( Problem5.divide( Arrays.asList( 3, 54, 1, 23 ), 55 ) );
    }

	@Test
	public void testGetLeastCommonMultipleOf2() throws Exception {

		assertEquals( 1, Problem5.getLeastCommonMultipleOf( 1, 1, 1 ) );
		assertEquals( 60, Problem5.getLeastCommonMultipleOf( 1, 2, 3, 4, 5 ) );
		assertEquals( 2520, Problem5.getLeastCommonMultipleOf( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ) );
		assertEquals( 232792560, Problem5.getLeastCommonMultipleOf( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 ) );
	}

}
