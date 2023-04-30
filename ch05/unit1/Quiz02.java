package ch05.unit1;

import java.util.Scanner;

public class Quiz02 {
		//5개의 점수(0~10)를 입력 받아 최대점수와 최소점수를 뺀 합을 구하는 프로그램

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score[] = new int[5];
		int tot, max, min;
		tot = 0;
		
		//dowhile문이용
		/* for(int i=0;i<score.length;i++) {
         do {
            System.out.print((i+1)+"번째 점수 : ");
            score[i]=sc.nextInt();
         }while(score[i]<0||score[i]>10);
		*/		
		
		
		for(int i = 0; i<score.length; i++) {
			System.out.println((i+1)+"번째 점수 : ");
			score[i] = sc.nextInt();
			if(score[i]<0 || score[i]>10) {
				i--;
				continue;
			}
			tot += score[i];
			
		}
		//최대 , 최소값
		max = min = score[0]; //처음 값을 최대와 최소의 초기값으로 
		for(int i =1; i <score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			}else if(min > score[i]) {
				min = score[i];
			}
		}
		
		int result = tot - max - min; //최대와 최소를 뺀 합
		
		System.out.print("점수 리스트 : ");
		for(int n : score) {
			System.out.print(n + " ");
		}
		
		System.out.println("\n최대와 최소값을 뺀 합 : " + result);
		
		
	   sc.close();

	}

}
