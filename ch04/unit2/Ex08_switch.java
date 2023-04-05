package ch04.unit2;

import java.util.Scanner;


public class Ex08_switch {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int s ;
		
		
		// switch 수실을 이용하여 평점 계산
		//90~100 : 4.0 , 80~89:3.0, 70~79:2.0, 60~69:1.0, 0~59:0.0, 기타 입력에러
		System.out.println("점수?");
		s =  sc.nextInt();
		
		var r =switch (s/10) {
		case 10, 9 -> 4.0;
		case 8 -> 3.0 ;
		case 7 -> 2.0 ;
		case 6 ->  1.0 ;
		case 5,4,3,2,1,0 ->  0.0 ;
		default -> "입력에러"; 
		};
		System.out.printf("점수 :" + s + "이면 평점 :" +r);
		
		
		
		
		sc.close();
	}
}

