package ch04.unit6;

import java.util.Scanner;

public class Ex01_return {

	public static void main(String[] args) {
		//정수를 입력 받으면 입력 받은 수까지 합구하기
		//단 입력 받은 수가 1 미만이라면 프로그램은 종료한다.
		
		Scanner sc = new Scanner(System.in);
		int s, n;
		
		System.out.println("수 ? ");
		n = sc.nextInt();
		
		if(n<1) {
			System.out.println("1이상의 수만 입력 가능합니다.");
			sc.close();
			return; // main메소드를 빠져나감
		}
		
		s = 0;
		for(int i = 1; i<=n; i++) {
			s += i;
			
		}
		System.out.println("결과 :" + s);
		
		sc.close();

	}

}
