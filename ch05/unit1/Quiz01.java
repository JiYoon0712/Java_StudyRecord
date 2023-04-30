package ch05.unit1;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int y;
		String [] ddi = new String[] {"원숭이","닭","개","돼지","쥐","소","범","토끼","용","범","말","양"};
		
		do {
			System.out.println("년도?");
			y= sc.nextInt();
		}while(y<1900);
		
		
		
	   System.out.println(y+"년도는" + ddi[y%12] + "띠의 해입니다.");
	   
	   sc.close();

	}

}
