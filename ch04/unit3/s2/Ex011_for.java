package ch04.unit3.s2;

public class Ex011_for {

	public static void main(String[] args) {
		//무한루프
		
		/*
		int s =0, n=0;
		for( ; ;) {
			n++;
			s += n;
			if(n>=10)
				break;
		}
		System.out.println(s); //55
		*/
		
		int s =0;
		for(int n =1 ; ;n++) {
			s += n;
			if(n>=10)
				break;
		}
		System.out.println(s); //55 ->위에 식이랑 위치만 바꾼것

	}

}
