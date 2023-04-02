package ch02.unit4;

/*
 - 정수 리터널
 */
public class Ex02_Literal {

	public static void main(String[] args) {
		int a = 0b101; // 숫자 앞 0b : 2진수, 5
		//a = 0b201; // 컴파일 오류. 2진수에는 2가 없음
		System.out.println(a);
		
		a = 0101; // 8진수. 숫자앞에 0이 있으면 8진수
		System.out.println(a); // 65
		
		a = 101; // 10진수
		System.out.println(a); // 101
		
		a = 0x101; // 16진수. 숫자 앞 0x는 16진수
		System.out.println(a); // 257
		
		// a = AB; // 컴파일 오류
		a = 0xAB;
		System.out.println(a); // 171
		
		a = 1_0_1; // 101
		System.out.println(a);
		
		long b = 10; // int 리터널을 long에 대입
		System.out.println(b);
		
		b = 10L; // long 리터널, 10L, 10l 모두 가능
		System.out.println(b);
		
		
	}

}
