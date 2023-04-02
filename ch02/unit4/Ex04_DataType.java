package ch02.unit4;

/*
 - 실수 관련 데이터 타입
 */
public class Ex04_DataType {

	public static void main(String[] args) {
		// byte < short < int < long < float < double
		//        char < int < long < float < double
		
		// float : 단정도형 실수 타입
		float f;
		f = 0; // int 리터널을 float에 대입
		System.out.println(f); // 0.0
		// f = 0.5; // 컴파일 오류. 배정도형 리터널은 float에 대입 불가
		f = 0.5f; // 단정도형 리터널
		System.out.println(f);
		f = 1.2e04f;
		System.out.println(f); // 12000.0
		f = 'A';
		System.out.println(f); // 65.0
		System.out.println();
		
		// double : 배정도형 실수 타입. 단 정도형 보다 정밀도가 높음
		double d;
		d = 0.5; // 배정도형 리터널
		System.out.println(d);
		d = 0.5D; // 배정도형 리터널
		System.out.println(d);
	}
}
