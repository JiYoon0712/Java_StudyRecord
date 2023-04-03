package ch03.unit3;

public class Ex02 {

	public static void main(String[] args) {
		int a, b;
		
		a = 10;
		b = 5;
		
		// 두 변수 값 바꾸기
		/*
		int c = a;
		a = b;
		b = c;
		*/
		
		a = a ^ b;
		b = b ^ a;
		a = a ^ b;
		System.out.println(a +"," + b);
	}
}
