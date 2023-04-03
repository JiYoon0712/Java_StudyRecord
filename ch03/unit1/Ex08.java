package ch03.unit1;

public class Ex08 {
	public static void main(String[] args) {
		int a;
		double b;
		
		a = 3456; // 1의 자리 버림
		a = a / 10 * 10;
		System.out.println(a);
		
		a = 3456; // 1의 자리 반올림
		a = (a + 5) / 10 * 10;
		System.out.println(a);
		
		b = 126.4563; // 소소점 3째자리 반올림하여 소수점 2자리
		System.out.printf("%.2f\n", b);
		
		// 소수점 3째자리를 버리고 2자리만 출력
		b = (int)(b * 100) / 100.0;
		System.out.printf("%.2f\n", b);
	}
}
