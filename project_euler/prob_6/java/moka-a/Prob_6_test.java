//1부터 10까지 자연수를 각각 제곱해 더하면 다음과 같습니다 (제곱의 합).
//
//12 + 22 + ... + 102 = 385
//1부터 10을 먼저 더한 다음에 그 결과를 제곱하면 다음과 같습니다 (합의 제곱).
//
//(1 + 2 + ... + 10)2 = 552 = 3025
//따라서 1부터 10까지 자연수에 대해 "합의 제곱"과 "제곱의 합" 의 차이는 3025 - 385 = 2640 이 됩니다.
//
//그러면 1부터 100까지 자연수에 대해 "합의 제곱"과 "제곱의 합"의 차이는 얼마입니까?

package test;

import static org.junit.Assert.*;
import main.Prob_6_solve;

import org.junit.Before;
import org.junit.Test;

public class Prob_6_test {
	
	private Prob_6_solve mProv_7_solve;
	
	@Before
	public void setUp() {
		
		mProv_7_solve = new Prob_6_solve();		
	}
	
	@Test
	public void testPowerSum() {
		
		assertEquals( "제곱합", 385, mProv_7_solve.powerSum(10) );
		assertEquals( "제곱합", 338350, mProv_7_solve.powerSum(100) );
	}
	
	@Test
	public void testSumPower() {
		
		assertEquals( "합제곱", 3025, mProv_7_solve.sumPower(10) );
		assertEquals( "합제곱", 25502500, mProv_7_solve.sumPower(100) );
	}
	
	@Test
	public void testResult() {
		
		assertEquals( "100의 제곱합과 합제곱 차이", 25164150, mProv_7_solve.result(100) );
	}

}
