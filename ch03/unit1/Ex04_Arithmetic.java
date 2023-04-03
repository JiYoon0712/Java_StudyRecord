package ch03.unit1;

public class Ex04_Arithmetic {
	public static void main(String[] args) {
		double a = 59.999999998;
		System.out.println(a);
		System.out.printf("%f\n", a); // 60.000000
		System.out.printf("%.2f\n", a); // 60.00
		
		// 소수점 3째 자리 버림
		System.out.println((int)(a * 100) / 100.); // 59.99
		
		// int n = (int)(a * 100);
		// System.out.println(n); // 5999
		// System.out.println(n/100.); // 59.99
		// System.out.println((double)n/100); // 59.99
	}
}
