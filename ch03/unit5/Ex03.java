package ch03.unit5;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정수를 입력 받아 양수, 음수, 영인지 판별
		int a;
		String s;
		
		System.out.print("정수 ? ");
		a = sc.nextInt();
		
		s = a > 0 ? "양수" : (a == 0 ? "영" : "음수");
		System.out.println(a +" : " + s);
		
		sc.close();
	}

}
