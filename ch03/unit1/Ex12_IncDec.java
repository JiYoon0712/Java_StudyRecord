package ch03.unit1;

public class Ex12_IncDec {

	public static void main(String[] args) {
		// 증감연산자(++, --)
		int a, b;
		
		a = 10;
		b = a++ + a++ + 1; // 10 + 11 + 1
		System.out.println(a + ", " + b); // 12  22
		
		a = 10;
		b = ++a + ++a + 1; // 11 + 12 + 1
		System.out.println(a + ", " + b); // 12 24
		
		a = 10;
		b = a++ + ++a + ++a + a++ + a++;  // 10 + 12(11+1) + 13 + 13 + 14(13+1)
		System.out.println(a + ", " + b); // 15 62
		
		a = 0;
		b = a---a; // b = a-- - a;  b = a - --a; // 0 - (-1)
		System.out.println(b);
	}

}
