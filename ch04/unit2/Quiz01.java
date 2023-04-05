package ch04.unit2;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n ;
		String grade;
		
		System.out.println("점수 ?");
		n = sc.nextInt();
		
		switch(n/10) {
		case 10 :
		case 9: grade = "수" ; break;
		case 8: grade = "우" ; break;
		case 7: grade = "미" ; break;
		case 6: grade = "양" ; break;
		default : grade = "가"; break;
		}
 
		System.out.println("점수 :" + n + "," + grade);
		
		
		sc.close();
		


	}

}
