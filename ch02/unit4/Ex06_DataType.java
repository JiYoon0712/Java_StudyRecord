package ch02.unit4;

/*
 - char : 2byte. 부호없는 정수형
 */
public class Ex06_DataType {

	public static void main(String[] args) {
		char c1 = 'A', c2;
		c2 = '\u0041'; // 유니코드. 
		System.out.println(c1 + ", " + c2);
		
		// c1 = ''; // 컴파일오류. 빈문자는 없음
		// c1 = 'AB'; // 컴파일 오류. 문자는 한글자로 구성
		// c1 = "A"; // 컴파일 오류. 문자열은 char에 대입 불가
		
		c1 = '대';
		System.out.println(c1);
		
		int n = c1; // char < int. 적은 자료형은 큰 자료형에 대입 가능
		System.out.println(n);
		n = '한';
		System.out.println(n);
		
		c1 = 54620;
		System.out.println(c1); // 한
		
		n = 0; // 숫자 0
		System.out.println(n); // 0

		n = '0'; // 문자
		System.out.println(n); // 48
		
		double x = 'K';
		System.out.println(x); // 75.0
	}
}
