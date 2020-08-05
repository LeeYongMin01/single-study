package chap05;

public class ArrayReferenceObjectExample {

  // 기본 타입 배열은 각 항목에 직접 값을 가지고 있지만,
  // 참조 타입( 클래스, 인터페이스) 배열은 각 항목에 객체의 주소값을 가지고 있다.

  // ex) String[] strArray = new String[3];
  // strArray[0] = "Java";
  // strArray[1] = "C++";
  // strArray[2] = "C#";

  // 배열 변수 3개를 선언하고 3개의 문자열을 참조하는 배열을 생성했다.

  // JVM 스택 영역에는 변수인 strArray가 있고 힙 영역에 인스턴스와 주소값이 있다.
  // ==는 객체 주소값 비교에만 사용 가능하고 문자열 비교에는 equals() 메소드를 사용

  public static void main(String[] args) {
    String[] strArray = new String[3];
    strArray[0] = "Java";
    strArray[1] = "Java";
    strArray[2] = new String("Java");

    System.out.println(strArray[0] == strArray[1]);
    System.out.println(strArray[0] == strArray[2]);
    System.out.println(strArray[0].equals(strArray[2]));

  }
}
