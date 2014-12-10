package main;

import java.util.ArrayList;

public class Prob_14_solve {

	public int nextNum(int num) {
		
		if ( (num-1)%3 == 0 && num != 1 )
			return ( num-1 )/3;
		else
			return num * 2;
	}

	public int findMaxNum() {
		
		int startNum = 8;
		int nextNum = 0;
		
		while( true ) {
			
			nextNum = nextNum(startNum);
			if ( nextNum > 1000000 ) {
				
				break;
			}
			
			startNum = nextNum;	
		}
			
		return startNum;
	}

	public long countHailStone( long num ) {
		
		ArrayList<Long> hailStoneArray = new ArrayList<Long>();
		
		while ( num != 1 ) {
			
			if ( num % 2 == 0 ) {
				
				num = num /2;
				hailStoneArray.add(num);
			} else {
				
				num = 3*num + 1;
				hailStoneArray.add(num);
			}
		}
		
		return hailStoneArray.size() + 1;
	}

	public long findResult() {
		
		long max = 0;
		long result = 0;
		
		for ( int i = 1000000 ; i > 100 ; i-- ) {
			
			if ( countHailStone( i ) >= max ) {
				
				max = countHailStone( i );
				result = i;
			}
		}
		
		return result;
	}

}
