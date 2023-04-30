package ch05.unit1;

/*
  - 1~10 사이 난수를 100개 발생하여 각 숫자가 몇개씩 발생되었는지 출력
    난수 = (int)(Math.random() * 10) + 1  
*/

public class Ex07 {
	public static void main(String[] args) {
		int [] count = new int[10];
		int n;
		
		for(int i=0; i<100; i++) {
			n = (int)(Math.random() * 10) + 1;
			
			count[n-1]++;
			
			if(i!=0 && i%10==0) {
				System.out.println();
			}
			
			System.out.printf("%5d", n);
		}
		System.out.println();
		
		for(int i=0; i<10; i++) {
			System.out.println((i+1) + " : " + count[i]);
		}
		
		
	}
}
