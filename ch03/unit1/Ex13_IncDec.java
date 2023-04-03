package ch03.unit1;

public class Ex13_IncDec {

	public static void main(String[] args) {
		// 증감연산자(++, --)
		char a;
		
		a = 'A';
		// a = a + 1; // 컴파일 오류
		// a = (char)(a + 1);  // 'B'
		a++;  // ++, --는 형변환이 일어나지 않음
		// ++a; // 위와 동일
		System.out.println(a);
		
		a = 'A';
		System.out.println((a++) + ", " + (++a)); // A, C
	}

}
