package ch05.unit1;

import java.util.Scanner;

/*
 - 1년 1월 1일 : 월요일 
 - 년도가 4의 배수이고 100의 배수가 아니거나 400의 배수이면
   윤년으로 2월이 29일(366)이고 그렇지 않으면 평년으로 2월이 28일(365)이다.
 
 - 2023년 8월 달력
   1) 1~8월의 마지막 일자
   2) 1.1.1 ~ 2023.8.1 의 전체 날수(일수) 계산
   3) 전체일수%7 => 0이면 8월 1일은 일, 1:월, .. 6:토
 */
public class Ex10_Calendar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y, m;
		int []days = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
		int tot;
		
		do {
			System.out.print("년도 ? ");
			y = sc.nextInt();
		} while(y < 100);
		
		do {
			System.out.print("월 ? ");
			m = sc.nextInt();
		} while(m < 1 || m > 12);
		
		// y년도 2월의 마지막 날짜 구하기
		days[1] = y%4==0 && y%100!=0 || y%400==0 ? 29 : 28;
		
		// y년 m월 1일 까지 날수 구하기
		// 1.1.1 ~ y-1년 12월 까지의 날수 구하기
		tot = (y-1) * 365 + (y-1) / 4 - (y-1) / 100 + (y-1) / 400;

		// 1월 m-1월 날수 더하기
		for(int i=0; i<m-1; i++) {
			tot += days[i];
		}
		
		// 1 일을 더한다.
		tot++;
		
		// y년 m월 1일의 요일 구하기
		int w = tot % 7;
		System.out.println(w);
		
		
		
		
		sc.close();
	}

}
