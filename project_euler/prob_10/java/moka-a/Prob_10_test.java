//10 이하의 소수를 모두 더하면 2 + 3 + 5 + 7 = 17 이 됩니다.
//
//이백만(2,000,000) 이하 소수의 합은 얼마입니까?

package test;

import static org.junit.Assert.*;
import main.Prob_10_solve;

import org.junit.Before;
import org.junit.Test;

public class Prob_10_test {
	
	private Prob_10_solve mProb_10_solve;
	
	@Before
	public void setUp() {
		
		mProb_10_solve = new Prob_10_solve();
	}
	
	@Test
	public void testCheckPrime() {
		
		assertTrue( mProb_10_solve.checkPrime(3) );
		assertFalse( mProb_10_solve.checkPrime(4) );
		assertTrue( mProb_10_solve.checkPrime(5) );
		assertTrue( mProb_10_solve.checkPrime(7) );
		assertTrue( mProb_10_solve.checkPrime(19) );
		assertTrue( mProb_10_solve.checkPrime(2) );
		assertFalse( mProb_10_solve.checkPrime(2000000) );
		assertTrue( mProb_10_solve.checkPrime(127) );
	}
	
	@Test
	public void testResult() {
		
		assertEquals( "", 17, mProb_10_solve.result(10) );
		assertEquals( "", 77, mProb_10_solve.result(20) );
		assertEquals( "", 5736396, mProb_10_solve.result(10000) );
		assertEquals( "", 142913828922, mProb_10_solve.result(2000000) );
	}

}
