package ch03.unit5;

import java.util.Scanner;

/*
 - 년도를 입력 받아 입력 받은 년도가 윤년이지 평년인지 출력하는 프로그램 작성
   년도가 4의 배수이고 100의 배수가 아니거나 400의 배수이면 윤년이고, 그렇지 않으면 평년
   평년은 2월이 28일, 윤년은 2월이 29일
   <실행 예>
   년도 ? 2023
   2023년은 평년입니다.
 */
public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y;
		String s;
		
		System.out.print("년도 ? ");
		y = sc.nextInt();
		
		s = y%4==0 && y%100!=0 || y%400==0 ? "윤년" : "평년";
		System.out.printf("%d년도는 %s입니다\n", y, s);
		
		sc.close();
	}

}
