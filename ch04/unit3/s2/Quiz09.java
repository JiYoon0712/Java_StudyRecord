package ch04.unit3.s2;
public class Quiz09 {

	public static void main(String[] args) {
		// for 문 기본문제 9] 
	
		/*      int s = 0;
   		for (int n = 1; n <= 10; n++) {
      	s += n;
      	if (n % 10 == 0)
         System.out.println(s);
         // 1~10까지의 합
         // 1~20까지의 합
         // :
         // 1~100까지의 합
   }      
		 */
		/*
		 // (1)      
   		int s = 0;
   		for (int n = 1; n <= 100; n++) {
      	s += n;
      	if (n % 10 == 0) {
         System.out.println((n - 9) + "~" + n + " : " + s);
         s = 0;
         // 1~10까지의 합
         // 11~20까지의 합
         //   :
         // 91~100까지의 합
          
      }
		 */

   
/*      // (2)      
      	int s;
      	for (int i = 1; i <= 10; i++) {
         s = 0;
         for(int j=(i-1)*10+1; j<=i*10; j++) {
            s+=j;
         }
         System.out.println(((i-1)*10+1) + "~" + (i*10) + " : " + s);
            
   }*/
   
   //(3)
      int s;
      for(int i=1; i<=100; i+=10) {
         s = 0;
         for(int j=i ; j<=(i-1)+10; j++) {
            s+=j;
         }
         System.out.println(i+"~"+((i-1)+10)+" : "+ s);
      }
         

}

}