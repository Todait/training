//세 자연수 a, b, c 가 피타고라스 정리 a2 + b2 = c2 를 만족하면 피타고라스 수라고 부릅니다 (여기서 a < b < c ).
//예를 들면 32 + 42 = 9 + 16 = 25 = 52이므로 3, 4, 5는 피타고라스 수입니다.
//
//a + b + c = 1000 인 피타고라스 수 a, b, c는 한 가지 뿐입니다. 이 때, a × b × c 는 얼마입니까?

package test;

import static org.junit.Assert.*;
import main.Prob_9_solve;

import org.junit.Before;
import org.junit.Test;

public class Prob_9_test {
	
	private Prob_9_solve mProb_9_solve;
	
	@Before
	public void setup() {
		
		mProb_9_solve = new Prob_9_solve();
	}
	
	@Test(timeout = 60000)
	public void testSetFactor() {
		
		assertArrayEquals( "a가 3일때 b,c", new int[] {200,375,425}, mProb_9_solve.setFactor() );
	}
	
	@Test
	public void testSumCheck() {
		
		assertEquals("합이 1000이 나오는가", true, mProb_9_solve.sumCheck(3,7,990) );
	}
	
	@Test
	public void testPythagorean() {
		
		assertEquals("" , true, mProb_9_solve.pythagorean(3,4,5) );
	}
	
	@Test
	public void result() {
		
		assertEquals("", 31875000, mProb_9_solve.result() );
	}

}
