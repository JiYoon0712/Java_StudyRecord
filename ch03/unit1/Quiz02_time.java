package ch03.unit1;

import java.util.Scanner;

public class Quiz02_time {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t, h, m, s;
		
		System.out.print("초를 입력하세요 ? ");
		t = sc.nextInt();
		
		// 1시간 : 60분, 3600초
		h = t / 3600;
		// h = (t / 60) / 60;  // t / 60 => 분
		m = (t / 60) % 60;
		s = t % 60;
		
		System.out.printf("%d초는 %d시간 %d분 %d초 입니다.\n", t, h, m, s);
		
		sc.close();
	}

}
