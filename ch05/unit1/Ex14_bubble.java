package ch05.unit1;

public class Ex14_bubble {

	public static void main(String[] args) {
		// Bubble sort

		int[] num = { 10,15,5,20,30,35,40,55,50,53};
		int t;
		boolean flag;//변수명 아무거나 해도 상관없음

		System.out.println("Source data : ");
		for (int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();

		//개선된 bubble sort
		flag =true;
		for(int i =1; flag; i++) {
			flag = false;
			for(int j = 0; j<num.length-1; j++) {
				if(num[j] > num[j+1]) {
					t = num[j]; num[j] = num[j+1]; num[j+1]=t;
					flag = true;
				}
				
			}
			System.out.print(i+"회전 : ");
			for (int n : num) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		
		System.out.print("sort data : ");
		for (int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();

	}

}
