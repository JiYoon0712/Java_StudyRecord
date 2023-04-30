package ch05.unit1;

public class Ex01 {

	public static void main(String[] args) {
		int []num; // 정수를 저장할 수 있는 배열 선언
		num = new int[5]; // 메모리 할당 : 정수 5개를 저장할수 있는 정수형 배열의 메모리 할당
		
		// int x;
		// System.out.println(x); // 컴파일 에러. x가 초기화 되어 있지 않음
		
		System.out.println(num[0]); // 0, 정수형배열은 메모리를 할당 받으면 0으로 초기화가 이루어짐
		
		// 배열 요소 접근 : 첨자를 이용
		// 첨자는 0 ~ "배열길이-1" 까지 가능
		num[0] = 1; num[1] = 3; num[2] = 5; num[3] = 7; num[4] = 9;
		// num[5] = 11; // 런타임오류(ArrayIndexOutOfBoundsException)
		
		int s = 0;
		for(int i=0; i<5; i++) {
			s += num[i];
		}
		System.out.println("결과:" + s);
	}

}
