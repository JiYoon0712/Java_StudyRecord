package ch02.unit4;

/*
 - 정수 관련 데이터 타입
 */
public class Ex03_DataType {

	public static void main(String[] args) {
		byte b = (byte)0b10000000;
		System.out.println(b); // -128
		
		b = -128;
		System.out.printf("%#X\n", b); // 0x80
		
		b = -84;
		System.out.printf("%#X\n", b); // 0XAC => 1010 1100
		
		b = 0b0011_0011;
		System.out.println(b); // 51
		
		int a = '대'; // 한글한글자. 문자
		char c = '대';
		System.out.println(a); // 45824
		System.out.println(c); // 대
		
		short s = 'A';
		System.out.println(s); // 65
		
		c = 'A';
		// s = c; // 컴오류. char 와 short는 크기 비교 불가
		s = (short)c;
		System.out.println(s);
		
		byte b1 = (byte)129;
		byte b2 = (byte)385;
		System.out.println(b1 == b2); // == : 같으면 true
		System.out.println(b1 + "," + b2); // -127,-127
	}

}
