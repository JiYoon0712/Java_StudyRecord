package ch04.unit3;

public class Ex101_dowhile {

	public static void main(String[] args) {
		// do~while :조건을 나중에 비교
		
		//1~10까지 합구하기
//		int n, s;
//		n = 0;
//		s = 0;
//		while(n<10) {
//			n++;
//			s +=n;
//		}
//		System.out.println(s); //그냥 while문
		
		
		int n, s;
		n = 0;
		s = 0;
		do {
			n++;
			s+=n;
		} while(n<10) ;
		System.out.println(s);// do while문
		System.out.println(n);// n의 값을 보려고 출력함.

	}

}
