import java.util.ArrayList;

public class Problem10 {

	private ArrayList<Long> primeNumbers;

	public Problem10() {

		primeNumbers = new ArrayList<Long>();
		primeNumbers.add( 2l );
		primeNumbers.add( 3l );
	}

	public static boolean isPrimeNumber( long number ) {

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

	public long getPrimeNumberAt( int index ) {

		index--;
		if( primeNumbers.size() > index ) {
			return primeNumbers.get( index );
		}

		int nowIndex = primeNumbers.size();
		long result = primeNumbers.get( nowIndex - 1 );
		while( index >= nowIndex ) {
			result += 2;
			if( isPrimeNumber( result ) ) {
				nowIndex++;
				primeNumbers.add( result );
			}
		}

		return result;
	}

	public long getSumOfPrimeNumberEqualOrLessThan( long number ) {

		long result = 0;
		long primeNum;
		for( int i = 1; (primeNum = getPrimeNumberAt( i )) <= number; i++ )
			result += primeNum;

		return result;
	}

}
