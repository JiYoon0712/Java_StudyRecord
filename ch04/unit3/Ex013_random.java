package ch04.unit3;

/*
  - 난수 : 정의된 범위 내에서 무작위로 추출된 수(복원 추출)
    Math.random() : 0 <= 난수 < 1 사이의 난수 발생(실수)
    (int)(Math.random() * 100) : 0 <= 난수 < 100 사이의 난수 발생
 */
public class Ex013_random {

	public static void main(String[] args) {
		/*
		int n;
		n = 0;
		while(n < 20) {
			System.out.print(Math.random() +"  ");
			n++;
		}
		System.out.println();
		*/
		
		// 1 ~ 100 사이의 난수를 100개 발생하여 한줄에 10개씩 출력
		int n, num;
		n = 0;
		while(n < 100) {
			n++;
			num = (int)(Math.random() * 100) + 1;
			System.out.print(num + "\t");
			if(n%10 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}
}
