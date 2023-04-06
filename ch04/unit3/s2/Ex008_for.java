package ch04.unit3.s2;

public class Ex008_for {

	public static void main(String[] args) {
		//1~10까지의 합
		/*
		int s, n;
		s = 0;
		for(n=1; n<=10; n++) {
			s +=n;
		}
		System.out.println("결과:" +s);//55
		*/
		
		/*
		int s  =0;
		
		for(int n=1; n<=10; n++) {
			s +=n;
		}
		System.out.println("결과:" +s);//55
		*/
		
		
		
		int s,n;
		for(n=1, s=0; n<=10; s+=n, n++) {
			
		}
		System.out.println("결과:" +s);//55
		
		
		
		
		
	}
}
