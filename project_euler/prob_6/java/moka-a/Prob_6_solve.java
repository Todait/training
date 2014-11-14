package main;

public class Prob_6_solve {

	public int powerSum(int num) {
		
		int result = 0;
		for( int i = 1 ; i <= num ; i++ ) {
			
			result += i*i;
		}
		
		return result;
	}

	public int sumPower(int num) {
		
		int result = 0;
		
		for( int i = 1 ; i <= num ; i++ ) {
			
			result += i;
		}
		return result*result;
	}
	

	public int result(int num) {

		int result = 0;
		
		result = sumPower(num) - powerSum(num);
		
		return result;
	}

}
