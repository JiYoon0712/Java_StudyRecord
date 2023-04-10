package ch04.unit5;

public class Ex03_label {

	public static void main(String[] args) {
		//continue label
		
		/*
		for(int i = 1; i<= 3; i++) {
			for(int j =1; j<=3; j++) {
				if(i + j ==4) {
					continue; //바로 위에 있는 for문 증감식으로 이동
				}
				System.out.println("i:" + i + ", j:" + j);
			}
		}
		//i:1, j:1
		//i:1, j:2
		//i:2, j:1
		//i:2, j:3
		//i:3, j:2
		//i:3, j:3
		 
		 */
		
		jump:
		for(int i = 1; i<= 3; i++) {
			for(int j =1; j<=3; j++) {
				if(i + j ==4) {
					continue jump; //식별자 아래 for문 증감식으로 이동
				}
				System.out.println("i:" + i + ", j:" + j);
			}
		}
		//i:1, j:1
		//i:1, j:2
		//i:2, j:1


		
	}

}
