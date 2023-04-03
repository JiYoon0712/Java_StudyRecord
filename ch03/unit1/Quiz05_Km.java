package ch03.unit1;

import java.util.Scanner;

public class Quiz05_Km {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dist, speed;
		int h, m;
		double s;
		double t;
		
		System.out.print("주행거리(Km) ? ");
		dist = sc.nextInt();
		
		System.out.print("시속(Km/h) ? ");
		speed = sc.nextInt();
		
		t = (double)dist / speed;  
		h = (int) t;
		m = (int)(t*60 % 60);
		s = (t * 3600) % 60;
		
		s = (int)(s * 100) / 100.0; // 소수점 3째자리에서 버림
		
		System.out.printf("%d시간 %d분 %.2f초 소요\n", h, m, s);
		
		sc.close();
	}

}
