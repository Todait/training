package main;

import java.util.ArrayList;

public class Prob_12_solve {

	public int findFactors(int num) {
		
		ArrayList<Integer> factors = new ArrayList<Integer>();
		
		for ( int i = 1 ; i <= Math.sqrt(num) ; i++ ) {
			
			if( num % i == 0 ) {
				
				if( Math.sqrt(num) == i ) {
					
					factors.add(i);
					break;
				}
				factors.add(i);
				factors.add(num/i);
			}
		}
		
		return factors.size();
	}
	

	public int findSamGakSu(int num) {
		
		return (num * (num+1))/2 ;
	}
	

	public int result() {
		
		int result = 0;
		
		for ( int i = 1 ; ; i++ ) {
			
			if ( findFactors( findSamGakSu(i) ) >= 500 ) {
		
				result = findSamGakSu(i);
				break;
			}
		}
		return result;
	}

}
