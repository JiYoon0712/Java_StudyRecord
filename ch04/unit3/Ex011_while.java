package ch04.unit3;



public class Ex011_while {

	public static void main(String[] args) {
		// 1~100까지 수중 3의 배수를 한줄에 5개씩 출력하고 마지막에 3의 배수의 합 출력
		int a=3;
		int j=0;
		int s=0;
		while(a<100) {
			System.out.print(a+"\t");
			j++;
			if(j%5==0) {
				System.out.println();
			}
			s+=a;
			a+=3;
		}
		System.out.println("\n결과 : "+s);
	}

}
