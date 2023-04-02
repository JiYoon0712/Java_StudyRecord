package ch02.unit4;

/*
 - 정수 관련 데이터 타입
 */
public class Ex01_DataType {

	public static void main(String[] args) {
		byte b1; // 1 byte(-128 ~ 127)
		byte b2 = 10; // byte 타입 선언과 동시에 초기화
		// byte b3 = 130; // 컴파일 오류. 표현범위를 벗어남
		// System.out.println(b1); // 컴파일오류. 초기화가 되어 있지 않음
		System.out.println(b2);
		
		b2 = 30; // 프로그램 실행주 값 변경. 이전 값(10)은 기억하지 못함
		System.out.println(b2);
		
		short s1, s2 = 100; // short : 2byte(-32768 ~ 32757)
		s1 = 'A';
		  // 'A' : 문자 리터널. 문자는 ASCII 코드로 저장되며 'A'는 65(01000001)로 저장
		System.out.println(s1 + ", " + s2);
		
		int i1 = 200; // 4byte
		int i2 = 'a'; // 97
		int i3;
		
		i3 = '1' + '3'; // 49 + 51
		  // '1' : 문자 1 => ASCII 코드값 49
		System.out.println(i1 + ", " + i2 + ", " + i3);
		
		// b1 = 'a'; // 가능
		// b1 = i2; // 컴파일오류. 큰자료형을 적은 자료형에 대입 불가
		b1 = (byte)i2; // 큰자료형을 적은 자료형으로 형을 변환하여 대입
		System.out.println(b1); // 97
		
		// 200 => 1100 1000
		b1 = (byte)i1;
		System.out.println(b1); // -56. overflow가 발생
		
		long l1, l2; // long형(8byte)
		l1 = 100; // int 리터널을 long에 대입
		l2 = i1; // int 변수를 long 변수에 대입. 적은 자료형은 큰 자료형에 대입 가능
		System.out.println(l1 + ", " + l2);
		
		// l2 = 2200000000; // 컴파일오류. int 리터널에는 22억이 없음
		l2 = 2200000000L; // long 리터널 
		System.out.println(l2);
	}

}
