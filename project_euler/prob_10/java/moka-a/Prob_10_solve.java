package main;

public class Prob_10_solve {

	public boolean checkPrime(int num) {
		
		for ( int i = 2 ; i <= (int) Math.sqrt(num) ; i++ ) {
			
			if ( num % i == 0 ) {
				if ( num != i ) return false;
			}
		}
		return true;
	}

	public long result(int num) {
		
		long result = 2;
		
		for( int i = 3 ; i <= num ; i += 2 ) {
			
			if ( checkPrime(i) ) result += i;
		}
		
		return result;
	}

}
