package ch04.unit3.s2;

public class Ex005_for {

	public static void main(String[] args) {

		// while
		int s, n;
		s = 0;
		n = 0;
		while(n<10) {
			n++;
			s+=n;
		}
		System.out.println("합 :" +s + ", n : " +n);
		
		
		
		
		//for문
		int s2,n2;
		s2 =0;
		for(n2 =1; n2<=10; n2++) {
			s2+= n2;
			
		}
		System.out.println("\n합 :" +s2 + ", n2 : " +n2);
		
	}
}
