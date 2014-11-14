package main;

import java.util.ArrayList;
import java.util.Comparator;

public class Prob_5_solve {

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
		
		for ( int i = 2 ; i <= num ; i++ ) {
			
			if( checkPrime(i) ) primeArray.add(i);
		}
		
		return primeArray;
	}

	public ArrayList<Integer> findAllFactor(int num) {
		
		ArrayList<Integer> factorArray = new ArrayList<Integer>();
		
		for( int j = 0 ; j < findPrimeArray(num).size() ; j++ ) {
		
			for ( int i = 1 ; i <= 5 ; i++ ) {
				
				if( Math.pow( findPrimeArray(num).get(j), i ) >= num ) {
					factorArray.add( (int) Math.pow( findPrimeArray(num).get(j), i-1 ) );
					break;
				}
			}
		}
		
		return factorArray;
	}

	public int result(int num) {
		
		int result = 1;
		findAllFactor(num);
		
		for ( int i = 0 ; i < findAllFactor(num).size() ; i++ ) {
			
			result = result * findAllFactor(num).get(i);
		}
		
		return result;
	}

}
