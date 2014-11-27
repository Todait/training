//
//
//1부터 n까지의 자연수를 차례로 더하여 구해진 값을 삼각수라고 합니다.
//예를 들어 7번째 삼각수는 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28이 됩니다.
//이런 식으로 삼각수를 구해 나가면 다음과 같습니다.
//
//    1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
//
//이 삼각수들의 약수를 구해봅시다.
//
//     1: 1
//     3: 1, 3
//     6: 1, 2, 3, 6
//    10: 1, 2, 5, 10
//    15: 1, 3, 5, 15
//    21: 1, 3, 7, 21
//    28: 1, 2, 4, 7, 14, 28 
//
//위에서 보듯이, 5개 이상의 약수를 갖는 첫번째 삼각수는 28입니다.
//
//그러면 500개 이상의 약수를 갖는 가장 작은 삼각수는 얼마입니까?

package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import main.Prob_12_solve;

import org.junit.Before;
import org.junit.Test;

public class Prob_12_test {
	
	private Prob_12_solve mProb_12_solve;

	@Before
	public void setUp() {
		
		mProb_12_solve = new Prob_12_solve();
	}
	
	@Test
	public void testFindFactors() {
		
		assertEquals( "28의 인수의 갯수", 6, mProb_12_solve.findFactors( 28 ) );
		assertEquals( "21의 인수의 갯수", 4, mProb_12_solve.findFactors( 21 ) );
	}
	
	@Test
	public void testFindSamGakSu() {
		
		assertEquals( "7번째 삼각수", 28, mProb_12_solve.findSamGakSu(7) );
		assertEquals( "6번째 삼각수", 21, mProb_12_solve.findSamGakSu(6) );
	}
	
	@Test
	public void testResult() {
		
		assertEquals( "", 76576500, mProb_12_solve.result() );
	}

}
