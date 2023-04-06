package ch04.unit3.s2;

public class Ex002_for {

	public static void main(String[] args) {

		int a;
		for(a=1; a<=10; a++) {
			System.out.print(a + " "); //1 2 3 9 
			if(a%3==0) {
				a +=5; //반복횟수에 사용된 변수를 변경하면 반복횟수가 달라짐
			}
		}
		System.out.println("\n밖 :" +a );//밖 :15
	}
}
