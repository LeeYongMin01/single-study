package scene.c7;

//<7.7.6> 객체 타입 확인(instanceof) - 객체 타입 확인

public class InstanceofExample {
  public static void method1(Parent2 parent2) {
    if(parent2 instanceof Child2) {
      Child2 child2 = (Child2) parent2;
      System.out.println("method1 - Child로 변환 성공");
    } else {
      System.out.println("method1 - Child로 변환되지 않음");
    }
}


  public static void method2(Parent2 parent2) {
    Child2 child2 = (Child2) parent2; // 예외가 발생할 가능성이 있음
    System.out.println("method2 - Child로 변환 성공");
  }


  public static void main(String[] args) {
    Parent2 parentA = new Child2();
    method1(parentA); // Child2 객체를 매개값으로 전달
    method2(parentA);

    Parent2 parentB = new Parent2();
    method1(parentB);   // Parent2 객체를 매개값으로 전달
    method2(parentB); // 예외 발생
  }
}

