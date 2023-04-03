package ch03.unit2;

public class Ex01_Relational {

	public static void main(String[] args) {
		int a = 10, b = 5;
		boolean c;
		
		c = a > b; // 관계 연산의 결과는 true 또는 false
		System.out.printf("%d > %d : %b\n", a, b, c);
		System.out.printf("%d >= %d : %b\n", a, b, a>=b);
		System.out.printf("%d < %d : %b\n", a, b, a<b);
		System.out.printf("%d <= %d : %b\n", a, b, a<=b);
		System.out.printf("%d == %d : %b\n", a, b, a==b);
		System.out.printf("%d != %d : %b\n", a, b, a!=b);
	}
}
