package ch04.unit3.s2;

import java.util.Scanner;

// [문제 6] 10개의 정수를 입력 받아 입력 받은 정수 중 가장 작은 값을 출력하는 프로그램을 작성하시오.

public class Quiz06_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		// 가장 큰 값을 최소치방의 초기값으로 할당
		int min = 0x7FFFFFFF;
		
		System.out.print("10개의 정수를 입력 하세요 ...");
		for (int i = 0; i < 10; i++) {
			n = sc.nextInt();

			if(min > n) {
				min = n;
			}
		}

		System.out.printf("최소값 : " + min);
		
		sc.close();
	}
}
