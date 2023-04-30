package ch05.unit1;

/*
  - 1~100 사이의 서로 다른 난수를 10개 발생하여 출력
    난수 = (int)(Math.random() * 100) + 1  
*/

public class Ex06 {
	public static void main(String[] args) {
		/*
		// 중복값이 출력
		int n;
		for(int i=0; i<10; i++) {
			n = (int)(Math.random() * 100) + 1;
			System.out.print(n + "  ");
		}
		System.out.println();
		*/
		
		int [] num = new int[10];
		
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random() * 100) + 1;
			for(int j = 0; j<i; j++) {
				if(num[i] == num[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int n : num) {
			System.out.print(n + "  ");
		}
		System.out.println();
		
		
	}
}
