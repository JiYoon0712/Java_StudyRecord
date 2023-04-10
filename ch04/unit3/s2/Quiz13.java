package ch04.unit3.s2;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		// 가위 바위 보
		Scanner sc = new Scanner(System.in);
		int user, com ;
		
		
		while(true) {
			do {
				System.out.print("1.가위 2.바위 3.보 4.종료 =>");
				user = sc.nextInt();
				
			}while(user < 1 || user > 4);
			
			if(user ==4) {
				break; //while(true) {를 빠져 나감
			}
			//1~3사이의 난수 발생
			com = (int)(Math.random()*3)+1;
			System.out.println("유저" + (user==1? "가위" : (user==2? "바위":"보")));
			System.out.println("컴퓨터" + (com==1? "가위" : (com==2? "바위":"보")));
			if(user == com) {
				System.out.println("비겼습니다");
			}else if(user-com==-2 || user-com==1) {
				// user : com => 1:3,2:1,3:2
				System.out.println("유저가 이겼습니다.\n");
		}else {
			System.out.println("컴퓨터가 이겼습니다.\n");
		}
	

	}
		sc.close();

}
}