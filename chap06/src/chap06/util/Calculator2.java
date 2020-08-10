package chap06.util;

// 메소드 오버로딩
// 메소드 오버로딩이 필요한 이유는
// => 매개값을 다양하게 받아 처리할 수 있도록 하기 위해서

// 메소드 오버로딩을 하기 위해서 매개변수의 타입,개수 순서중에 하나라도
// 다른것이 있어야한다.



public class Calculator2 {
  // 정사각형의 넓이
  public double areaRectangle(double width) {
    return width * width;
  }

  // 직사각형의 넓이
  public double areaRectangle(double width, double height) {
    return width * height;
  }
}
