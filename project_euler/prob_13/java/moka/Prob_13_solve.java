package main;

public class Prob_13_solve {

	public long parseStringToLong(String num, int line, int start, int end) {
		
		return Long.parseLong( num.split("    ")[line].substring(start,end) );
	}
	
	
	public long[] parseArray(String num, int start, int back) {
		
		long parseLong[] = new long[100];
		
		for( int i = 0 ; i < 100 ; i++ ) {
			
			parseLong[i] = parseStringToLong(num, i, start, back);
		}
		
		return parseLong;
	}


	public long sumLongArray(long[] longArray) {
		
		long sum = 0;
		
		for( int i = 0 ; i < longArray.length ; i++ ) {
			
			sum += longArray[i];
		}
		
		return sum;
	}

	public long result(String num) {
		
		long result = 0;
		long carry = 0;
		
		carry = sumLongArray( parseArray(num, 40,50) ) / 10000000000L;
		
		carry = (sumLongArray( parseArray(num, 30, 40) ) + carry) / 10000000000L;
		
		carry = (sumLongArray( parseArray(num, 20, 30) ) + carry) / 10000000000L;
		
		carry = (sumLongArray( parseArray(num, 10, 20) ) + carry) / 10000000000L;
		
		result = (sumLongArray( parseArray(num, 0, 10) ) + carry);
	
		result = Long.parseLong( Long.toString( result ).substring(0, 10) );
		
		return result;
	}


}
