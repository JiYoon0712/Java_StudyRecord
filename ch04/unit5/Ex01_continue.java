package ch04.unit5;

//continue : while, do~while, for 사용
//while , do~while : 조건식으로 올라감
//for : 증감식으로 이동
public class Ex01_continue {

	public static void main(String[] args) {
		int n,s;
		n = s = 0;
		
		// 2 또는 3의 배수를 제외한 수의 합
		while(n < 100) {
			n++;
			if(n%2 == 0 || n%3==0) {
				continue;
			}
			s+=n;
		}
		System.out.println("결과 : " + s);
		
	}

}
