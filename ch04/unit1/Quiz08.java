package ch04.unit1;

import java.util.Scanner;

/*
	성적처리 프로그램
*/
public class Quiz08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String hakbeon, name;
		int midterm, finals, absence, attend, report;
		int score;
		char grade;

		System.out.print("학번 ? ");
		hakbeon = sc.next();

		System.out.print("이름 ? ");
		name = sc.next();

		System.out.print("중간고사 점수 ? ");
		midterm = sc.nextInt();

		System.out.print("기말고사 점수 ? ");
		finals = sc.nextInt();

		System.out.print("결석횟수 ? ");
		absence = sc.nextInt();

		System.out.print("레포트 점수 ? ");
		report = sc.nextInt();

		if (absence >= 6) {
			attend = 0;
		} else if (absence >= 4) {
			attend = 60;
		} else if (absence >= 2) {
			attend = 80;
		} else {
			attend = 100;
		}

		midterm = (int) (midterm * 0.4);
		// midterm = midterm * 4 / 10;
		// midterm *= 0.4;
		finals = (int) (finals * 0.4);
		attend = (int) (attend * 0.1);
		report = (int) (report * 0.1);

		score = midterm + finals + attend + report;

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println("\n학번\t이름\t중간고사\t기말고사\t출석점수\t레포트\t합산점수\t학점");
		System.out.print(hakbeon + "\t");
		System.out.print(name + "\t");
		System.out.print(midterm + "\t");
		System.out.print(finals + "\t");
		System.out.print(attend + "\t");
		System.out.print(report + "\t");
		System.out.print(score + "\t");
		System.out.println(grade);

		sc.close();
	}
}
