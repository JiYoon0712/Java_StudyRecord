package ch02.unit6;

/*
  - 문서화 주석 만들기
    형식 :  javadoc  -use  클래스명.java  -d  저장할경로
    사용예 : doc 폴더가 없으면 doc폴더를 만들고 그안에 HTML 문서를 만듬
      cmd> javadoc  -use  Ex01_javadoc.java  -d  doc
*/
public class Ex01_javadoc {
	/**
	 * 짝수인지 판별하는 메소드
	 * <p> 정수를 2로 나눈 나머지가 0이면 짝수이다.</p>
	 * @param num	짝수인지 판별할 수 <code>int</code>
	 * @return		짝수여부를 반환한다. <code>boolean</code>
	 */
	public boolean isEven(int num) {
		return num % 2 == 0;
	}
	
}
