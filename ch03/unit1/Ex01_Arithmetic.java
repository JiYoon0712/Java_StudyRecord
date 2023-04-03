package ch03.unit1;

public class Ex01_Arithmetic {
	public static void main(String[] args) {
		byte b1, b2, b3;
		b1 = 10;
		b2 = 20;
		// b3 = b1 + b2; // 컴파일 오류
		  // byte + byte => int + int 형변환이 일어남
		  // int 를 byt에 대입할 수 없으므로 컴파일오류
		b3 = (byte)(b1 + b2); // 강제 형변환
		System.out.println(b3);
		
		b1 = 100;
		b2 = 120;
		b3 = (byte)(b1 + b2);
		System.out.println(b3); // -36. overflow가 발생
		
		char ch = 'A';
		// ch = ch + 10; // 컴파일 오류
		ch = (char)(ch + 10);
		System.out.println(ch); // K
		
		int n = 'A' + 'B'; // 65 + 66
		System.out.println(n);
		n = 'A' + 10;
		System.out.println(n);
		
		n = 011 + 20;  // 9 + 20, 010 : 8진수
		System.out.println(n); // 29
		
		n = 0b101 + 20; // 5 + 20
		System.out.println(n);
		

	}
}
