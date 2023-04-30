package ch05.unit1;

public class Ex08_initialize {

	public static void main(String[] args) {
		// 배열의 초기화
		int[] num = new int[] {2,4,6,8,10};
		// int[] num = new int[5] {2,4,6,8,10}; // 컴파일오류. 초기화 할 경우 크기 명시 불가
		// int[] num = {2,4,6,8,10}; // 가능. 선언과 동시에 초기화 할 경우 new int[] 생략 가능
		
		int [] a;
		// a = {1,3,5,7,9}; // 컴파일 오류
		a = new int[]{1,3,5,7,9}; // 배열 선언과 초기화를 따로 할 경우에는 new int[] 생략 불가
		
		System.out.println("num 배열 요소수 : " + num.length);
		System.out.println("a 배열 요소수 : " + a.length);
		
		int tot = 0;
		for(int n : num) {
			tot += n;
		}
		System.out.println("num 배열 요소의 합 : " + tot);
	}

}
