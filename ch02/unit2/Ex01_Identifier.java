package ch02.unit2;

/*
 - 식별자
   : 자바유니코드레터로 시작(A~Z, a~z, _, $, 각국언어)
   : 숫자를 포함할 수 있다.
   : 예역어는 불가 
 */
public class Ex01_Identifier {
	public static void main(String[] args) {
		String name = "홍길동";
		// String #name = "김자바"; // 컴파일오류. # 불가
		// String int; // 컴파일오류. 예약어는 불가
		// String 3abs; // 컴파일에러. 숫자로 시작 불가
		
		int $age = 10;
		//int age-1 = 10; // 컴파일오류. - 불가
		int a = 20;
		// double a = 10.5; // 동일한 이름으로 선언 불가
		
		String 주소 = "서울"; // 각국언어 가능
		
		System.out.println(name);
		System.out.println($age);
		System.out.println(a);
		System.out.println(주소);
	}
}
