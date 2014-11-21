package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prob_11_solve {

	public int[][] parseNums(String[] nums) {
		
		int[][] result = new int[20][20];
	
		for ( int j = 0 ; j < 20 ; j++ ) {
			
			for ( int i = 0 ; i < 20 ; i++ ) {
				
				result[j][i] = Integer.parseInt( nums[j].split(" ")[i] );
			}
		}
        
		return result;
	}

	public int findMax(String[] nums) {

		int max = 0;
		
		int[][] parsedNums = new int[20][20]; 
				
		parsedNums = parseNums(nums);
		
		// 가로로 곱한것만 중에 최대
		for ( int j = 0 ; j <= 19 ; j++ ) {
			
			for ( int i = 0 ; i <= 16 ; i++ ) {
				
				int product = parsedNums[j][i] * parsedNums[j][i+1] * parsedNums[j][i+2] * parsedNums[j][i+3];
				if ( product >= max ) max = product;
			}
		}
		
		// 세로로 곱한것 중의 최대
		for ( int j = 0 ; j <= 16 ; j++ ) {
			
			for ( int i = 0 ; i <= 19 ; i++ ) {
				
				int product = parsedNums[j][i] * parsedNums[j+1][i] * parsedNums[j+2][i] * parsedNums[j+3][i];
				if ( product >= max ) max = product;
			}
		}
	
		// 우하로 대각선 곱한것 중의 최대
		for ( int j = 0 ; j <= 16 ; j++ ) {
			
			for ( int i = 0 ; i <= 16 ; i++ ) {
				
				int product = parsedNums[j][i] * parsedNums[j+1][i+1] * parsedNums[j+2][i+2] * parsedNums[j+3][i+3];
				if ( product >= max ) max = product;
			}
		}
		
		// 좌로 대각선 곱한것 중의 최대
		for ( int j = 3 ; j <= 19 ; j++ ) {
			
			for ( int i = 0 ; i <= 16 ; i++ ) {
				
				int product = parsedNums[j][i] * parsedNums[j-1][i+1] * parsedNums[j-2][i+2] * parsedNums[j-3][i+3];
				if ( product >= max ) max = product;
			}
		}
		
		return max;
	}

}
