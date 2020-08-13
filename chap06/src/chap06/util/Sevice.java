package chap06.util;

// 어노테이션 적용 클래스

public class Sevice {

  @PrintAnnotation
  public void method1() {
    System.out.println("실행 내용1");
  }

  @PrintAnnotation("*")
  public void method2() {
    System.out.println("실행 내용2");
  }

  @PrintAnnotation(value="#", number=20)
  public void method3() {
    System.out.println("실행 내용3");
  }


}
