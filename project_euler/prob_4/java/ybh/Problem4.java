
/**
 * 앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 부릅니다.
 * 두 자리 수를 곱해 만들 수 있는 대칭수 중 가장 큰 수는 9009 (= 91 × 99) 입니다.
 * 세 자리 수를 곱해 만들 수 있는 가장 큰 대칭수는 얼마입니까?
 */
public class Problem4 {

	public static boolean isPalindrome( int number ) {

		String numberString = String.valueOf( number );
		String reverseNumberString = new StringBuilder( numberString ).reverse().toString();

		return numberString.equals( reverseNumberString );
	}

	public static int getMaxPalindrome( int digit ) {

		int maxPalindrome = 0;
		int maxNumOfDigit = (int) Math.pow( 10, digit ) - 1;

		for( int i = maxNumOfDigit; i > 0; i-- ) {

			for( int j = i; j > 0; j-- ) {

				int multiple = i * j;
				if( maxPalindrome < multiple && isPalindrome( multiple ) ) {
					maxPalindrome = multiple;
				}
			}
		}

		return maxPalindrome;
	}

}
