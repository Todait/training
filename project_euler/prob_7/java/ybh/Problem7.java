public class Problem7 {

	public static boolean isPrimeNumber( int number ) {

		if( 1 == number ) {
			return false;
		}

		double sqrt = Math.sqrt( number );

		for( int i = 2; i <= sqrt; i++ ) {

			if( 0 == number % i ) {
				return false;
			}
		}

		return true;
	}

	public static int getPrimeNumberAt( int index ) {

		int result = 2;
		int nowIndex = 1;

		while( index > nowIndex ) {

			result++;

			if( isPrimeNumber( result ) ) {
				nowIndex++;
			}
		}

		return result;
	}

}
