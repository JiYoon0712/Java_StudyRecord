package ch04.unit3.s2;

public class Ex009_for {

	public static void main(String[] args) {
		// 1~100까지 수중 3의 배수를 한줄에 10개씩 출력하고 마지막에 3의 배수의 평균을 출력
		
		int b = 0;
		int c = 0;
		
	for(int a = 3; a<=100; a+=3) {
		System.out.print(a +"\t");
		++b;
		if(b % 10 ==0) {
			System.out.println();
		}
		c += a;
		
		
	}
	System.out.println("\n평균 :"+c/b);

	}

}
