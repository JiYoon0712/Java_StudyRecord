package ch03.unit1;

public class Ex03_Arithmetic {
	public static void main(String[] args) {
		int a=3, b=2;
		double c;
		
		c = a/b + a/b; // 3/2 + 3/2 = 1 + 1 = 2.0
		System.out.println(c); // 2.0
		
		c = (double)a/b + a/b; // 정수(int)를 실수(double)로 변환하여 연산
		    // 1.5 + 1 = 2.5
		System.out.println(c);
		
		c = (double)(a/b) + a/b;
		    // 1.0 + 1 = 2.0
		System.out.println(c);

		c = (double)a/b + (double)a/b;
		    // 1.5 + 1.5 = 3.0
		System.out.println(c);
		
		c = 3.7 % 1.3; // 자바는 실수에서 % 연산(나머지)이 가능
		   // 1.1
		System.out.println(c);
		
		c = 'A' + 10;
		   // 65 + 10 = 75.0
		System.out.println(c);
		
		c = 'X' / 'A';
		   // 88 / 65 = 1.0
		System.out.println(c);
		
		c = (double)'X' / 'A';
		   // 88.0 / 65 = 1.353846153846154
		System.out.println(c);
	}
}
