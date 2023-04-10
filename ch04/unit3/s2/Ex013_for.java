package ch04.unit3.s2;

public class Ex013_for {

	public static void main(String[] args) {
		// 다중 for
		for(int i =1; i<=3; i++) {
			System.out.println("i:" +i);
			
			for(int j=1; j<=i; j++) {// 
				System.out.println("i:" + i +",j:" +j);
				//i:1,j:1
				//i:2,j:1,2
				//i:3,j:1,2,3
			}
			
			System.out.println("--------");
		}
		
	}

}
