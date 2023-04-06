package ch04.unit3;

public class Ex102_dowhile {

	public static void main(String[] args) {
		// do~while :조건을 나중에 비교
		//while 조건을 만족하지 않으면 실행하지 않지만 do while은 조건을 만족하지 않아도 한번은 실행함
		
		int n;
		n = 10;
		while(n<10) { // 조건이 거짓이면 한번도 실행안함
			n++;
			System.out.println("안 :" + n); //한번도 실행하지 않음
		}
		System.out.println("밖 :" +n); // 10
		
		System.out.println("--------------------");
		
		int a;
		a = 10;
		do { // 적어도 한번은 실행
			a++;
			System.out.println("do~while 안 : " +a); //11->한번 시행
		} while(a<10);
		System.out.println("do~while 밖 : " +a); // 11
		


	}

}
