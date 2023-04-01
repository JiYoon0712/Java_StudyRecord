package ch02.unit3;

public class Ex04_printf {
	public static void main(String[] args) {
		System.out.printf("%d\n", 12345);
		System.out.printf("%d\n", -12345);
		System.out.printf("%,d\n", 12345);
		System.out.printf("%,d\n", 123456789);
		
		// System.out.printf("%d\n", 2200000000); // 컴파일오류. 정수(int) 범위를 벗어남
		System.out.printf("%d\n", 2200000000L); // long 형 리터널
		System.out.println();
		
		System.out.printf("%d\n", 123);
		System.out.printf("*%10d*\n", 123); // 앞에 7칸의 공백 다음에 123 출력
		System.out.printf("*%-10d*\n", 123); // 123 출력하고 뒤에 7칸의 공백 출력
		System.out.printf("*%010d\n", 123);	 // 앞 7칸에 0으로 채우고 123 출력
		System.out.printf("%2d\n", 1234); // 정수는 자릿수가 부족하면 자릿수는 무시하고 1234 출력
		System.out.println();
		
		System.out.printf("%d\n", 123);   // 123
		System.out.printf("%d\n", -123);  // -123
		System.out.printf("%+d\n", 123);  // +123
		System.out.printf("%+d\n", -123); // -123
		System.out.printf("%(d\n", 123);  // 123
		System.out.printf("%(d\n", -123); // (123)
		System.out.println();
		
		System.out.printf("%c\n", 'A'); // A
		System.out.printf("%c\n", 'a'); // a
			// %c : 한문자 출력
		System.out.printf("%C\n", 'A'); // A
		System.out.printf("%C\n", 'a'); // A
			// %C : 영문자를 대문자 출력
		System.out.printf("%c\n", 65); // A : ASCII 코드가 65
		System.out.printf("%c\n", 97); // a : ASCII 코드가 97
		// System.out.printf("%d\n", 'A'); // 런타임 오류
			// 문자는 %c로 출력 불가
		System.out.println();
	}
}
