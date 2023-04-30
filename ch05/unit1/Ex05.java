package ch05.unit1;

import java.util.Scanner;

// 5명의 이름과 점수를 입력 받아 이름과 각점수의 편차(수-평균)를 출력하고
// 마지막에 전체 총점 및 평균을 출력하는 프로그램 작성

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[5];
		int[] score = new int[5];
		int tot = 0;
		double ave, s;
		
		for(int i=0; i<name.length; i++) {
			System.out.print((i+1) + "번째 이름 ? ");
			name[i] = sc.next();
			System.out.print("     점수 ? ");
			score[i] = sc.nextInt();
			
			tot += score[i];
		}
		
		ave = (double)tot / score.length;
		
		System.out.println("이름\t점수\t편차");
		System.out.println("------\t------\t------");
		for(int i=0; i<name.length; i++) {
			s = score[i] - ave; // 편차
			System.out.println(name[i] + "\t" + score[i] + "\t" + s);
		}
		System.out.println("------------------------");
		System.out.println("총합 : " + tot + ",  전체평균 : " + ave);
		System.out.println("------------------------");
		
		sc.close();
	}
}
