package ch04.unit2;

import java.util.Scanner;

public class Ex03_Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		//정수를 입력 받아 3의 배수인지 판별
		System.out.println("정수 ?");
		n = sc.nextInt();
		
		switch(n % 3) {
		case 0 : System.out.println("3의 배수"); break;
		case 1 :
		case 2 : System.out.println("3의 배수가 아님"); break; //case 1, 2 내용이 똑같으면 마지막 케이스문에만 쓰면됌
		}
		
		sc.close();
		
		


	}

}
