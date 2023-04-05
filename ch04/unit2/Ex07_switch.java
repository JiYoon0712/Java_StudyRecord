package ch04.unit2;

import java.util.Scanner;

/*
 * -switch 수식
 * :반환값은 -> 또는 yield를 이용하여 반환
 * yield는 case라벨(:)에서도 사용 가능
 * yield는 제한된 식별자로 var 처럼 변수로 사용 가능하다.
 */
public class Ex07_switch {

	public static void main(String[] args) {
		// 년도와 월을 입력 받아 입력 받은 월의 마지막 날짜를 구하는 프로그램

		Scanner sc = new Scanner(System.in);
		int y, m;

		System.out.println("년도 ? ");
		y = sc.nextInt();

		System.out.println("월 ? ");
		m = sc.nextInt();
		
        //switch 수식
		var s =switch (m) {
		case 1, 3, 5, 7, 8, 10, 12 -> 31;
		case 4, 6, 9, 11 -> 30;
		case 2 -> {
			int d = y%4 == 0 && y%100 != 0 || y%400 == 0 ? 29 : 28;
			yield d;
		    }
		default -> "입력 오류 입니다.";
		};
		System.out.println(y + "년도" + m + "월의 마지막 일자는" + s + "입니다");
		
		sc.close();
	}
}

