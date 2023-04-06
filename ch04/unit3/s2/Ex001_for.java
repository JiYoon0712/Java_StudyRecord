package ch04.unit3.s2;

public class Ex001_for {

	/* for 문장
		for (초기식; 조건식; 증감식;) {
		실행문 ;
		}
		실행문 2;
		
		조건식 : true 또는 false
		초기식 -> 조건식(참) ->실행문
				증감식 ->조건식(참) ->실행문
				증감식 ->조건식(참) ->실행문
				증감식 ->조건식(거짓) ->for문을 빠져 나감
	 */
	public static void main(String[] args) {
		/*
		int n;
		for(n = 1; n <= 10; n++) {
			System.out.print(n + " "); //1 2 3 4 5 6 7 8 9 10 
		}
		System.out.println("\n밖 :" +n); //11
*/
		
		
		for(int n=1; n<=10; n++) { //for문에서 변수 선언 가능
			System.out.print(n + " ");
	}
		//System.out.println("\n밖 :" +n);//에러. for 문에서 선언한 변수는 밖에서 사용불가
		//int n; //가능
		System.out.println();
}
}
