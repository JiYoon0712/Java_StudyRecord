package ch04.unit2;

import java.util.Scanner;

public class Ex01_Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		// 1~3 사이의 수를 입력 받아 입력 받은 수만큼 * 출력
		
		System.out.print("수 ? ");
		n = sc.nextInt();
		
		// switch : byte, short, char, int, String, enum만 가능
		switch(n) { // switch(수식또는변수)
		case 3: System.out.print("*"); // case 다음에는 리터널(상수)만 가능
		case 2: System.out.print("*");
		case 1: System.out.print("*");
		}
		System.out.println();
		
		sc.close();

	}

}

