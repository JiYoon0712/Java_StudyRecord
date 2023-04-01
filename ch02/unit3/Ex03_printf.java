package ch02.unit3;

/*
 	System.out.printf("출력서식", 출력값, 출력값)
 	  : 출력서식에 따라 값을 출력, 출력 후 라인을 넘기지 않음
 	  : System.out.format("출력서식", 출력값, 출력값)와 동일
 */
public class Ex03_printf {
	public static void main(String[] args) {
		int a, b, c; // 정수를 저장할 수 있는 변수 세개 선언
		a = 13;  // a변수에 13을 대입
		b = 4;
		
		c = a + b;  // 합 구하기
		
		System.out.println(a + " + " + b + " = " + c); // 13 + 4 = 17
		// System.out.printf("%d + %d = %d\n", a, b);  // 런타임 오류
		System.out.printf("%d + %d = %d\n", a, b, c);  // 13 + 4 = 17
		System.out.format("%d + %d = %d\n", a, b, c);  // 13 + 4 = 17
			// % : 형식지정 제어문자
			// %d : 정수를 출력 
		System.out.println();
		
		System.out.printf("%d + %d = %d\t", a, b, a+b); // 합
		System.out.printf("%d - %d = %d%n", a, b, a-b); // 차
			// \n, %n : 라인 넘김
		System.out.printf("%d * %d = %d\t", a, b, a*b); // 곱
		System.out.printf("%d / %d = %d\n", a, b, a/b); // 몫
		
		System.out.printf("%d %% %d = %d\n", a, b, a%b); // 나머지
			// %% : %가 형식 문자가 아닌 %를 출력할 경우 사용
	}
}
