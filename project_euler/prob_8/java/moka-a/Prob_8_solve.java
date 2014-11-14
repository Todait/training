package main;

import java.util.ArrayList;

public class Prob_8_solve {

	public int findMax(ArrayList<Integer> arr) {
		
		int max = 0;
		
		for ( int i = 0 ; i < arr.size() ; i++ ) {
			
			if ( arr.get(i) >= max ) max = arr.get(i); 
		}
		
		return max;
	}

	public ArrayList<Integer> parseData(String data) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for ( int i = 0 ; i < data.length() - 4 ; i++ ) {
		
			arr.add( stringToInt(data, i) * stringToInt(data, i+1) * stringToInt(data, i+2) * stringToInt(data, i+3) * stringToInt(data, i+4) );
		}
		
		return arr;
	}
	
	public int stringToInt(String num, int i ) {
		
		return Integer.parseInt( String.valueOf(num.toCharArray()[i]) );
	}

	public int result(String data) {	
		
		return findMax( parseData(data) );
	}

}
