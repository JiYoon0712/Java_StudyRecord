package ch04.unit3.s2;

import java.util.Scanner;

//[문제 5] 10개의 정수를 입력 받아 입력 받은 정수 중 가장 큰 값을 출력하는 프로그램을 작성하시오.
public class Quiz05_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		int max;

		// 가장 처음에 입력 받은 값을 최대치방의 초기값으로 할당
		System.out.println("10개의 정수를 입력 하세요 ...");
		max = sc.nextInt();
		for (int i = 1; i < 10; i++) {
			n = sc.nextInt();			
			
			if(max < n) {
				max = n;
			}
		}
		
		System.out.printf("최대값 : " + max);
		sc.close();
	}
}
