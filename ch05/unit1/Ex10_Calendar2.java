package ch05.unit1;

import java.util.Scanner;

/*

  문제) 년,월,일을 입력받아 입력 받은 날짜의 요일 출력 프로그램 작성
  년?2023
  월? 2
  일 ? 8
  2023년 2월 8일 수요일
 */

public class Ex10_Calendar2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int y, m,d;
		int [] days = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] week = new String[] {"일", "월","화","수","목","금","토"};
		int tot;
		
		do {
			System.out.print("년도 ? ");
			y = sc.nextInt();
		} while(y<100);
		
		
		do {
			System.out.print("월 ? ");
			m = sc.nextInt();
		} while(m < 1 || m > 12);
		
		
		//y년도 2월의 마지막 날짜 구하기
		days[1] = y%4==0 && y%100!=00 ||y%400==0 ? 29 : 28;

		do {
			System.out.print("일 ? ");
			d = sc.nextInt();
		} while(d < 1 || d > days[m-1]);
		
		// y년 m월 d일 까지 날수 구하기
		//1.1.1.~y-1년 12월 까지의 날 수 구하기
		tot = (y-1) *365 + (y-1) / 4 - (y-1) / 100 + (y-1) / 400;
		
		//1월 m-1월 날수 더하기
		for(int i = 0; i<m-1; i++) {
			tot += days[i];
		}
		
		//d 일을 더한다.
		tot+=d;
		
		//y년 m월 d일의 요일 구하기;
		int w = tot %7;
		
		System.out.println(y + "년 " + m +"월 " + d + "일은 " + week[w] + "요일입니다.");
		
		
		
		sc.close();

	}

}
