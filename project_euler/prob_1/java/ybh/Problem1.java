/**
 * 10보다 작은 자연수 중에서 3 또는 5의 배수는 3, 5, 6, 9 이고, 이것을 모두 더하면 23입니다.
 * 1000보다 작은 자연수 중에서 3 또는 5의 배수를 모두 더하면 얼마일까요?
 */
public class Problem1 {

	public static void main( String[] args ) {

		System.out.println( getSumOf3And5MultipleUnder( 1000 ) );
	}

	public static boolean isMultipleOfNumber( int mumtipleNumber, int number ) {

		return (0 != mumtipleNumber) ? (0 == mumtipleNumber % number) : (false);
	}

	public static int getSumOf3And5MultipleUnder( int number ) {

		int result = 0;

		for( int i = 0; i < number; i++ ) {

			if( isMultipleOfNumber( i, 3 ) || isMultipleOfNumber( i, 5 ) ) {
				result += i;
			}
		}

		return result;
	}

}
