package ch05.unit1;

public class Ex15_insertion {

	public static void main(String[] args) {
		// insertion sort
		
		int[] num = { 25,15,7,4,12,9,17,16,20,13};
		int t;

		System.out.println("Source data : ");
		for (int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();

		// insertion sort
		// 1회전 = (2번째:1번째)
		// 2회전 = (3번째:2번째), (2번째:1번째)
		// 3회전 = (4번째:3	번째), (3번째:2번째),(2번째:1번째)
		// 1회전 인덱스 = (1:0)
		// 2회전 인덱스 = (2:1),(1:0)
		// 3회전 인덱스 = (3:2),(2:1),(1:0)
		// 4회전 인덱스 = (4:3),(3:2),(2:1),(1:0)
		
		for(int i = num.length-1; 0<=i; i--) {
			for(int j = 0; j<num.length-1; j++) {
				if(num[j] > num[j+1]) {
					t = num[j]; num[j] = num[j+1]; num[j+1]=t;
				}
				
			}
			
		}
		System.out.println("insertion data : ");
		for (int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();

	}

}
