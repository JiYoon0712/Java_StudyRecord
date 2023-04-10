package ch04.unit5;

import java.util.Scanner;

public class Quiz01_continue1 {

	public static void main(String[] args) {
		// 5개의 홀수를 입력 받아 입력 받은 홀수의 합 구하기
		// 단, 입력 받은 수가 짝수이거나 0이하면 다시 입력 받는다
		// for문 이용!!!
		
		Scanner sc = new Scanner(System.in);
		int s, n;
		
		s=0;
		
		System.out.println("5개의 홀수 입력,,,"); // 1 2 3 4 5
		for(int i =1; i<=5; i++) {
			n = sc.nextInt();
			if(n %2 ==0 || n<=0) {
				i--;
				continue;
			}
			s+=n;
		}
		System.out.println("결과 : " + s);
		
		sc.close();

	}

}
