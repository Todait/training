package main;

import java.util.ArrayList;

public class Prob_6_solve {
	
	public boolean checkPrime(long num) {
		
		for ( long i = 2 ; i <= num ; i ++ ) {
			
			if ( num % i == 0 ) {
				if ( i == num ) return true;
				else return false;
			}	
		}
		return false;
	}

	public ArrayList<Integer> findPrimeArray(int num) {
		
		ArrayList<Integer> primeArray = new ArrayList<Integer>();
		
		for ( int i = 1 ; ; i++ ) {
			
			if( checkPrime(i) ) primeArray.add(i);
			if( primeArray.size() >= num ) break;
		}
		
		return primeArray;
	}

}
