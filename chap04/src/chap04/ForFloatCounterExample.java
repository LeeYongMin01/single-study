package chap04;

// float 타입 카운터 변수

public class ForFloatCounterExample {
  public static void main(String[] args) {
    for(float x = 0.1f; x <= 1.0f; x += 0.1f) {

      System.out.println(x);
    }


  }
}
// 이론적으로 3라인은 10번 실행되어야 하지만 9번 실행되었다.
// 0.1은 float타입으로 정확하게 표현할 수 없기 때문
// 따라서, for문에서 변수를 선언할때는 부동소수점 타입은 사용할 수 없다.
