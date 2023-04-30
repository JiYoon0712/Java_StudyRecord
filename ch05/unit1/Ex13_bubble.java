package ch05.unit1;

public class Ex13_bubble {

	public static void main(String[] args) {
		// Bubble sort

		int[] num = { 10, 5, 15, 31, 27};
		int t;

		System.out.println("Source data : ");
		for (int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();

		// bubble sort
		// 1회전 = (1번째:2번째),(2번째:3번째),(3번째:4번째),(4번째:5번째)
		// 1회전 인덱스 = (0:1),(1:2),(2:3),(3:4)
		// 2회전 인덱스 = (0:1),(1:2),(2:3)
		// 3회전 인덱스 = (0:1),(1:2)
		// 4회전 인덱스 = (0:1)
		
		for(int i =1; i<num.length; i++) {
			for(int j = 0; j<num.length-1; j++) {
				if(num[j] > num[j+1]) {
					t = num[j]; num[j] = num[j+1]; num[j+1]=t;
				}
				
			}
			
		}
		System.out.println("bubble data : ");
		for (int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();

	}

}
