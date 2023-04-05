package ch04.unit2;

import java.util.Scanner;

/*
 * -강화된 switch 문
 * :여러조건
 * case 1: case 2: case3: ... (이전방식)
 * case 1,2,3 으로 코딩가능 (새로운방식)
 * :화살표 case 라벨(->)
 * case : 에서 break;를 사용한것과 동일
 * 화살표 case 라벨(->)에서는 실행할 문이 두줄 이상인 경우 반드시 블럭화({})
 * :JDK 12, 13에서는 preview로 제공되었으며, JDK 14 부터 표준화
 */
public class Ex06_switch {

	public static void main(String[] args) {
		// 년도와 월을 입력 받아 입력 받은 월의 마지막 날짜를 구하는 프로그램

		Scanner sc = new Scanner(System.in);
		int y, m;

		System.out.println("년도 ? ");
		y = sc.nextInt();

		System.out.println("월 ? ");
		m = sc.nextInt();

		switch (m) {
		case 1, 3, 5, 7, 8, 10, 12 -> System.out.printf("%d년 %d월의 마지막 날짜는 31일\n", y, m);
		case 4, 6, 9, 11 -> System.out.printf("%d년 %d월의 마지막 날짜는 30일\n", y, m);
		case 2 -> {
			int d = y%4 == 0 && y%100 != 0 || y%400 == 0 ? 29 : 28;
			System.out.printf("%d년 %d월의 마지막 날짜는 %d일\n", y, m, d);

		    }
		default -> System.out.println("입력 오류 입니다.");
		}
		
		sc.close();
	}
}
