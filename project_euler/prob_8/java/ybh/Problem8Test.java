import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class Problem8Test {

	private static final String NUMBER;

	static {

		NUMBER = new StringBuilder()
				.append( "73167176531330624919225119674426574742355349194934" )
				.append( "96983520312774506326239578318016984801869478851843" )
				.append( "85861560789112949495459501737958331952853208805511" )
				.append( "12540698747158523863050715693290963295227443043557" )
				.append( "66896648950445244523161731856403098711121722383113" )
				.append( "62229893423380308135336276614282806444486645238749" )
				.append( "30358907296290491560440772390713810515859307960866" )
				.append( "70172427121883998797908792274921901699720888093776" )
				.append( "65727333001053367881220235421809751254540594752243" )
				.append( "52584907711670556013604839586446706324415722155397" )
				.append( "53697817977846174064955149290862569321978468622482" )
				.append( "83972241375657056057490261407972968652414535100474" )
				.append( "82166370484403199890008895243450658541227588666881" )
				.append( "16427171479924442928230863465674813919123162824586" )
				.append( "17866458359124566529476545682848912883142607690042" )
				.append( "24219022671055626321111109370544217506941658960408" )
				.append( "07198403850962455444362981230987879927244284909188" )
				.append( "84580156166097919133875499200524063689912560717606" )
				.append( "05886116467109405077541002256983155200055935729725" )
				.append( "71636269561882670428252483600823257530420752963450" )
				.toString();
	}

	@Test
	public void testStringToLinkedList() throws Exception {

		LinkedList<Integer> queue = Problem8.stringToLinkedList( NUMBER );

		assertEquals( NUMBER.length(), queue.size() );

		for( int i = 0; i < queue.size(); i++ ) {
			int numberAt = Integer.parseInt( String.valueOf( NUMBER.charAt( i ) ) );
			assertEquals( numberAt, queue.get( i ).intValue() );
		}
	}

	@Test
	public void testNextWindow() throws Exception {

		LinkedList<Integer> queue = Problem8.stringToLinkedList( NUMBER );
		final int windowSize = 5;
		LinkedList<Integer> window = new LinkedList<Integer>();

		for( int i = 1; i <= 997; i++ ) {
			window = Problem8.nextWindow( queue, window, windowSize );

			if( 997 == i ) {
				assertNull( window );
			}
			else {
				assertEquals( windowSize, window.size() );
				String substring = NUMBER.substring( i - 1, i + windowSize - 1 );

				for( int j = 0; j < window.size(); j++ ) {
					int numberAt = Integer.parseInt( String.valueOf( substring.charAt( j ) ) );
					assertEquals( numberAt, window.get( j ).intValue() );
				}
			}
		}
	}

	@Test
	public void testComputeMultiplication() throws Exception {

		int multiplication = Problem8.computeMultiplication( new LinkedList<Integer>( Arrays.asList( 1, 1, 1, 1, 1 ) ) );
		assertEquals( 1, multiplication );

		multiplication = Problem8.computeMultiplication( new LinkedList<Integer>( Arrays.asList( 7, 1, 1, 1, 2 ) ) );
		assertEquals( 14, multiplication );

		multiplication = Problem8.computeMultiplication( new LinkedList<Integer>( Arrays.asList( 7, 3, 1, 6, 7 ) ) );
		assertEquals( 882, multiplication );

		multiplication = Problem8.computeMultiplication( new LinkedList<Integer>( Arrays.asList( 1, 1, 0, 1, 1 ) ) );
		assertEquals( 0, multiplication );
	}

	@Test
	public void testGetMaxMultiplication() throws Exception {

		int maxMultiplication = Problem8.getMaxMultiplication( NUMBER, 5 );
		assertEquals( 40824, maxMultiplication );
	}

}
