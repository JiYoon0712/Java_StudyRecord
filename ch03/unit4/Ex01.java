package ch03.unit4;

public class Ex01 {

	public static void main(String[] args) {
		short a, b;
		
		a = 10; b = 5;
		a = (short)(a + b); // 반드시 형변환을 해야 함
		System.out.println(a); // 15
		
		a = 10; b = 5;
		a += b; // 자료형을 유지하며, 형변환이 일어나지 않으므로 위보다 빠름
		System.out.println(a); // 15
		
		char c = 'A';
		c += 10;
		System.out.println(c); // K
		
		float f = 5.5f;
		c = 'A';
		c += f;
		System.out.println(c); // F
		
		int n = 4;
		n *= 0.5;
		System.out.println(n); // 2
	}
}
