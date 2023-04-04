package ch04.unit1;

import java.util.Scanner;

public class Ex007_if {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n;
      
      // 입력 받은 수가 2와 3의 배수, 2 또는 3의 배수인지 판별
      System.out.println("정수 ? ");
      n = sc.nextInt();
      
      //잘못 코딩한 예
/*      if(n%2==0) {
         System.out.println(n +" -> 2의 배수");
      }else if(n%3 ==0) {
         System.out.println(n + " -> 3의 배수");
      } else {
         System.out.println(n + "-> 2또는 3의 배수가 아님");
      }
*/      
      
      if(n%2==0 && n%3 ==0) {
         System.out.println(n +" -> 2와 3의 배수");
      }else if(n%2==0) {
         System.out.println(n +" -> 2의 배수");
      }else if(n%3 ==0) {
         System.out.println(n + " -> 3의 배수");
      }else {
         System.out.println(n + "-> 2또는 3의 배수가 아님");
      }
      
      sc.close();
   }

}
