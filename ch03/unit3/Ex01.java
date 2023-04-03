package ch03.unit3;

public class Ex01 {

	public static void main(String[] args) {
		int a, b;
		
		a = 10;  // 0000 1010
		b = ~a;  // 1111 0101
		System.out.println(a +"," + b); // 10, -11
		
		a = -10;
		b = ~a;
		System.out.println(a +"," + b); // -10, 9
		
		a = 13;  // 0000 1101
		b = 7;   // 0000 0111
		System.out.printf("%d & %d = %d\n", a, b, a&b); // 0101 => 5
		System.out.printf("%d | %d = %d\n", a, b, a|b); // 1111 => 15
		System.out.printf("%d ^ %d = %d\n", a, b, a^b); // 1010 => 10
	}
}
