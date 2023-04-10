package ch04.unit3.s2;

public class Quiz107 {

	public static void main(String[] args) {
		// 구구단 (면접기출문제)

		/*
		 * for(int i = 1; i<=9;i++) { for(int j =2; j<=5; j++) {
		 * System.out.printf("%d*%d=%d\t",j,i,j*i); } System.out.println(); }
		 * System.out.println();
		 * 
		 * 
		 * for(int i = 1; i<=9;i++) { for(int j =6; j<=9; j++) {
		 * System.out.printf("%d*%d=%d\t",j,i,j*i); } System.out.println(); }
		 * System.out.println();
		 */
		int dan;
		for (int k = 0; k < 2; k++) {
			for (int i = 1; i <= 9; i++) {
				for (int j = 2; j <= 5; j++) {
					dan = k *4 +j;
					System.out.printf("%d*%d=%d\t", dan, i, dan * i);
					
				}
				System.out.println();
			}
			System.out.println();

		}
	}
}
