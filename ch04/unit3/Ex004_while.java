	package ch04.unit3;

public class Ex004_while {

   public static void main(String[] args) {
      int s, n;
      
      // 1~100까지의 합
      
      s = 0;
      n = 0;
      while(n < 100) {
         n++;
         s+=n;
         
      }
      System.out.println(n);   // 100
      System.out.println("결과 : " + s );   // 5050
      
      
//      s = 0;
//      n = 0;
//      while(n++ < 100) {      
//         s+=n;
//      }
//      System.out.println(n);   // 101
//      System.out.println("결과 : " + s );   // 5050
      
      
//      s = 0;
//      n = 0;
//      while(++n < 100) {      
//         s+=n;
//      }
//      System.out.println(n);   // 100
//      System.out.println("결과 : " + s );   // 4950(1~99)
      
      
//    s = 0;
//    n = 0;
//    while(++n <= 100) {      
//       s+=n;
//  }
//    System.out.println(n);   // 101
//    System.out.println("결과 : " + s );   // 5050
   }

}