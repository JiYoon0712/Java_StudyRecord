package ch05.unit1;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz03 {
	// 구매 개수를 입력받아 구매 개수만큼의 로또를 출력하는 프로그램
	// -구매 개수가 1~5사이가 아닌 경우 다시 입력 받는다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count;
		int[] lot = new int[6];

		do {
			System.out.println("구매 개수[1~5] ?");
			count = sc.nextInt();
		} while (count < 1 || count > 5);
		// count에 입력한 숫자만큼 발생
		for (int k = 0; k < count; k++) {
			// 로또 한게임 발생
			for (int i = 0; i < lot.length; i++) {
				lot[i] = (int) (Math.random() * 45) + 1;

				for (int j = 0; j < i; j++) {
					if (lot[i] == lot[j]) {
						i--;
						break;
					}
				}

			}
			
			Arrays.sort(lot); //크기순으로 정렬
			
			System.out.println((k + 1) + "번째 : ");
			for (int i = 0; i < lot.length; i++) {
				System.out.printf("%3d", lot[i]);
			}
			System.out.println();
		}

		sc.close();

	}

}
