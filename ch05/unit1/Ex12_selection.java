package ch05.unit1;

public class Ex12_selection {

	public static void main(String[] args) {
		// Selection sort

		int[] num = { 10, 5, 15, 31, 27, 54, 19, 20, 3, 17 };
		int t;

		System.out.println("Source data : ");
		for (int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();

		// Sort
		// 1회전 = (1번째:2번째),(1번째:3번째),(1번째:4번째),(1번째:5번째)
		// 1회전 인덱스(i=0) = (0:1),(0:2),(0:3),(0:4)
		for (int i = 0; i < num.length - 1; i++) { // 회전
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					t = num[i]; num[i] = num[j]; num[j] = t;
				}
			}
		}
		System.out.println("Sort data : ");
		for (int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();

	}

}
