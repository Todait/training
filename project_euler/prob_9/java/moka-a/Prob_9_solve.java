package main;

public class Prob_9_solve {

	public int[] setFactor() {
		
		
		for ( int a = 1 ; a <= 330 ; a++ ) {
			
			for ( int b = a ; b <= 1000 ; b++ ) {
					 
				if ( a + b > 1000-b-a && 1000-b-a > 0) {
					
					if ( pythagorean(a,b,1000-b-a) ) {
						
						int[] result = {a,b,1000-b-a};
						return result;
					}
				}
			}
		}		
		return null;
	}

	public boolean sumCheck(int a, int b, int c) {
		
		if ( a + b + c == 1000) return true;
		else return false;
	}

	public boolean pythagorean(int a, int b, int c) {
		
		if ( a*a + b*b == c*c ) return true;
		else return false;
	}

	public int result() {

		return setFactor()[0] * setFactor()[1] * setFactor()[2];
	}

}
