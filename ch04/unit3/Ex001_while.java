package ch04.unit3;

public class Ex001_while {

   public static void main(String[] args) {
   /*   int n;
      
      while(n<10) {//컴파일 오류 : n이 초기화되지않음.
         
         n++;
         System.out.println("안 : "+n);
      }
   */
      
      int n;
      n=0;
      while(n<10) {
         n++;
         System.out.print(n+" ");// 1~10 : 10번 실행됨
      }
      System.out.println("\n밖 : "+n+"\n");//10 : 1번 실행됨
      

      n=0;
      while(n>10) {//조건이 처음에 거짓이면 한번도 실행하지않음.
         n++;
         System.out.print(n+" ");// 실행하지않음.
      }
      System.out.println("\n밖 : "+n+"\n");//0
      
      
      n=0;
      while(++n<10) {
         System.out.print(n+" ");// 1~9 : 9번 반복
      }
      System.out.println("\n밖 : "+n+"\n");//10 출력
      
      n=0;
      while(n++<10) {
         System.out.print(n+" ");//1~10 : 10번 반복
      }
      System.out.println("\n밖 : "+n+"\n");//11
      
      n=0;
      while(n++<10) {
         n++;
         System.out.print(n+" ");//2,4,6,8,10 : 5번 반복
      }
      System.out.println("\n밖 : "+n+"\n");//11 출력      
      
   }
   

}