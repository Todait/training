//소수를 크기 순으로 나열하면 2, 3, 5, 7, 11, 13, ... 과 같이 됩니다.
//
//이 때 10,001번째의 소수를 구하세요.

package test;

import static org.junit.Assert.*;
import main.Prob_7_solve;

import org.junit.Before;
import org.junit.Test;

public class Prob_7_test {
	
	private Prob_7_solve mProb_6_solve;
	
	@Before
	public void setUp() {
		
		mProb_6_solve = new Prob_7_solve();
	}
	
	@Test
	public void testCheckPrime() {
		
		assertTrue( mProb_6_solve.checkPrime(7) );
		assertTrue( mProb_6_solve.checkPrime(2) );
		assertTrue( mProb_6_solve.checkPrime(19) );
	}
	
	@Test
	public void testFindPrimeArray() {
		
		assertEquals( 10, mProb_6_solve.findPrimeArray(10).size() );
		assertEquals( 20, mProb_6_solve.findPrimeArray(20).size() );
		assertEquals( 100, mProb_6_solve.findPrimeArray(100).size() );
		assertEquals( 1000, mProb_6_solve.findPrimeArray(1000).size() );
//		assertEquals( 10001, mProb_6_solve.findPrimeArray(10001).size() );
	}
	
	@Test
	public void testResult() {
		
		assertEquals( 104743, (int) mProb_6_solve.findPrimeArray(10001).get(10000) );
	}

}
