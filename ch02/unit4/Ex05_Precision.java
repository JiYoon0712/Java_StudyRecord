package ch02.unit4;

public class Ex05_Precision {

	public static void main(String[] args) {
		// 정밀도
		int a1 = 2_000_000_000;
		int a2 = 2_000_000_050;
		
		float b1 = 2_000_000_000;
		float b2 = 2_000_000_050;

		double c1 = 2_000_000_000;
		double c2 = 2_000_000_050;
		
		System.out.println("int : " + a1 + ", " + a2);
			// 2000000000, 2000000050
		System.out.printf("float : %.2f %.2f\n", b1, b2);
		System.out.println(b1 == b2); // true
			// 2000000000.00, 2000000000.00
		System.out.printf("double : %.2f %.2f\n", c1, c2);
		System.out.println(c1 == c2); // false
			// 2000000000.00, 2000000050.00
	}

}
