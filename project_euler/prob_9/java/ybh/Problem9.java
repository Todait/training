public class Problem9 {

	public static boolean isPythagorasNums( int a, int b, int c ) {

		return (a * a + b * b == c * c);
	}

	public static int getAnswer() {

		for( int c = 499; c > 0; c-- ) {

			for( int a = 1; a <= (1000 - c) / 2; a++ ) {

				int b = 1000 - (a + c);
				if( isPythagorasNums( a, b, c ) ) {
					return a * b * c;
				}
			}
		}

		return 0;
	}

}
