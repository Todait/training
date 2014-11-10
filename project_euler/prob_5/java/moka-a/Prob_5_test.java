//1 ~ 10 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다.
//
//그러면 1 ~ 20 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까?

package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import main.Prob_5_solve;

import org.junit.Before;
import org.junit.Test;

public class Prob_5_test {
	
	private Prob_5_solve mProb_5_solve;
	
	@Before
	public void setUp() {
		
		mProb_5_solve = new Prob_5_solve();
	}
	
	@Test
	public void testCheckPrime() {
		
		assertTrue( mProb_5_solve.checkPrime(5) );
		assertFalse( mProb_5_solve.checkPrime(6) );
		assertTrue( mProb_5_solve.checkPrime(7) );
		assertTrue( mProb_5_solve.checkPrime(19) );
		assertFalse( mProb_5_solve.checkPrime(18) );
	}
	
	@Test
	public void testFindPrimeArray() {
		
		ArrayList<Integer> expect = new ArrayList<Integer>();
		expect.add(2);
		expect.add(3);
		expect.add(5);
		expect.add(7);
		
		assertEquals( 4, mProb_5_solve.findPrimeArray(10).size() );
		assertEquals( expect, mProb_5_solve.findPrimeArray(10) );
		
		expect.clear();
		expect.add(11);
		assertEquals( expect.get(0), mProb_5_solve.findPrimeArray(20).get(4) );
		assertEquals( 8, mProb_5_solve.findPrimeArray(20).size() );
	}
	
	@Test
	public void testFindAllFactor() {
		
		ArrayList<Integer> expect = new ArrayList<Integer>();
		expect.add(5);
		expect.add(7);
		expect.add(8);
		expect.add(9);
		
		assertEquals( expect.size(), mProb_5_solve.findAllFactor(10).size() );
		assertEquals( 8, mProb_5_solve.findAllFactor(20).size() );
	}
	
	@Test
	public void testResult() {
		
		assertEquals( 2520, mProb_5_solve.result(10) );
		assertEquals( 232792560, mProb_5_solve.result(20) );
	}

}
