import java.util.ArrayList;
import java.util.Collections;

/**
 * 1 ~ 10 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다.
 * 그러면 1 ~ 20 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까?
 */
public class Problem5 {

	public static int getLeastCommonMultipleOf( int num1, int num2 ) {

		ArrayList<Integer> primeFactors = new ArrayList<Integer>();
		int i = 2;

		while( num1 >= i && num2 >= i ) {
			if( 0 == num1 % i && 0 == num2 % i ) {
				num1 /= i;
				num2 /= i;
				primeFactors.add( i );
			}
			else {
				i++;
			}
		}

		primeFactors.add( num1 );
		primeFactors.add( num2 );

		int result = 1;
		for( Integer primeFactor : primeFactors )
			result *= primeFactor;

		return result;
	}

	public static int getLeastCommonMultipleOf( int... nums ) {

		ArrayList<Integer> originNums = removeOneFrom( nums );
		ArrayList<Integer> newNums = new ArrayList<Integer>();
		newNums.addAll( originNums );

		ArrayList<Integer> primeFactors = new ArrayList<Integer>();
		int i = 2;

		while( isLessThanMax( i, originNums ) ) {
			if( divide( newNums, i ) ) {
				primeFactors.add( i );
			}
			else {
				i++;
			}
		}

		primeFactors.addAll( newNums );

		int result = 1;
		for( Integer primeFactor : primeFactors )
			result *= primeFactor;

		return result;
	}

	private static ArrayList<Integer> removeOneFrom( int[] nums ) {

		ArrayList<Integer> newNums = new ArrayList<Integer>();

		for( int num : nums ) {
			if( 1 < num ) {
				newNums.add( num );
			}
		}

		return newNums;
	}

	private static boolean isLessThanMax( int num, ArrayList<Integer> nums ) {

		if( 0 == nums.size() ) {
			return false;
		}

		return (Collections.max( nums ) > num);
	}

	private static boolean divide( ArrayList<Integer> nums, int divisor ) {

		boolean result = false;

		for( int i = 0; i < nums.size(); i++ ) {
			int numAtI = nums.get( i );
			if( 0 == numAtI % divisor ) {
				nums.set( i, numAtI / divisor );
				result = true;
			}
		}

		return result;
	}

}
