package ch04.unit3.s2;


public class Quiz10 {

	public static void main(String[] args) {
		//for문 기본문제 10]
		
		for(int i = 1; i<=100; i++) {
			if(i%4==0 && i%6==0) {// 4와 6의 공배수
				System.out.print(i + " ");
			}
		}
		System.out.println();

	}

}