package ch05.unit1;

public class Ex09_initialize {

	public static void main(String[] args) {
		int[] unit = new int[] {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int money = 6788500;
		
		System.out.printf("금액 : %,d\n", money);
		System.out.println("화폐\t\t개수");
		for(int n : unit) {
			System.out.printf("%,d원\t\t%d\n", n, money/n);
			money %= n;
		}
 
	}

}
