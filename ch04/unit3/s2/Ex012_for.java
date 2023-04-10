package ch04.unit3.s2;

public class Ex012_for {

	public static void main(String[] args) {
		// 다중 for
		for(int i =1; i<=3; i++) {
			System.out.println("i:" +i);
			
			for(int j=1; j<=2; j++) {//  3*2 = 6번 반복
				System.out.println("i:" + i +",j:" +j);
			}
			
			System.out.println("--------");
		}
		
	}

}
