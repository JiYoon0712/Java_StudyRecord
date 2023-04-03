package ch03.unit3;

public class Ex04 {

	public static void main(String[] args) {
		int a, b;
		
		a = 128;
		b = a << 3; // a * (2의 3승)과 동일
		System.out.printf("%d << 3 = %d\n", a, b);
		
		a = 128;
		b = a >> 3; // a / (2의 3승)과 동일
		System.out.printf("%d >> 3 = %d\n", a, b);
		
		a = -128;
		b = a >> 3; // 부호가 채워짐
		System.out.printf("%d >> 3 = %d\n", a, b); // -16
		
		a = -128;
		b = a >>> 3;  // 0 채워짐
		System.out.printf("%d >> 3 = %d\n", a, b); // 536870896
	}
}
