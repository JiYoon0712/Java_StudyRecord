package ch03.unit1;

public class Ex11_IncDec {

	public static void main(String[] args) {
		// 증감연산자(++, --)
		int a, b;
		
		a = 10;
		System.out.println("a 초기값 : " + a);
		a++; // 결과는 a = a + 1; 동일
		     // ++a; 와 동일
		System.out.println("a++ 후 : " + a); // 11
		
		a = 10;
		b = ++a;
		// a=a+1; b=a; 와 결과가 동일
		System.out.println("b=++a 연산후 : " + a + ", " + b); // 11 11

		a = 10;
		b = a++;
		// b=a; a=a+1; 와 결과가 동일
		System.out.println("b=a++ 연산후 : " + a + ", " + b); // 11 10
		
		a = 10;
		b = --a;
		System.out.println("b=--a 연산후 : " + a + ", " + b); // 9 9
		
		a = 10;
		b = a--;
		System.out.println("b=a-- 연산후 : " + a + ", " + b); // 9 10
		
		double c = 3.5;
		c++;
		System.out.println(c); // 4.5
	}

}
