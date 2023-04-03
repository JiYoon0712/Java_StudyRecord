package ch03.unit1;

public class Ex02_Arithmetic {
	public static void main(String[] args) {
		int a;
		
		// 정수 연산자 정수 => 정수
		a = 3/2 + 1/2 + 1/2; // 1 + 0 + 0 = 1 
		System.out.println(a);
		
		double b;
		b = 3/2 + 1/2 + 1/2;  // 1 + 0 + 0 = 1.0 
		System.out.println(b);
		
		// 정수 연산자 실수 => 실수
		b = 3/2. + 1/2 + 1/2.;  // 1.5 + 0 + 0.5
		System.out.println(b);

	}
}
