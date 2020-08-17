package scene.c7;

// <7.7.5> 강제 타입 변환(Casting) -  강제 타입 변환(캐스팅)

public class ChildExample1 {
  public static void main(String[] args) {
    Parent1 parent = new Child1(); // 부모 타입으로 자동 타입 변환
    parent.field1 = "data1";

    parent.method1();
    parent.method2();

    // parent.field2() = "data2"; // Child1 클래스에만 있기 때문에 사용 불가능
    // parent.method3(); // Child1 클래스에만 있기 때문에 사용 불가능

    Child1 child = (Child1) parent; // 강제 타입 변환
    child.field2 = "yyy"; // 가능
    child.method3(); // 가능
  }

}
