package chap02.practice;

public class FromIntToFloat {
  public static void main(String[] args) {
    int num1 = 123456780;
    int num2 = 123456780;
    
    float num3 = num2;
    num2 = (int)num3;
    
    int result = num1 - num2;
    System.out.println(result);
    
    // 결과값이 0이 나오지 않음.
    // 이유 : int 값을 float타입으로 자동 변환하면서 문제가 발생했기 때문.
    // float타입은 부호(1비트) + 지수(8비트) + 가수(23비트) 로 비트가 할당되어 있는데
    // int 값을 손실 없이 float 타입의 값으로 변환하려면 가수 23비트로 표현 가능한 값이어야함
    // 근데 123456780은 23비트로 표현할 수 없기 때문에 근사치로 변환됨.
    // 따라서 float값을 다시 int 타입으로 변환하면 원래의 int 값을 얻지 못함
    // 9라인의 num1과 num2는 같은 값이 아니라는 말
    // 해결방법 : double 타입을 이용
    // double 타입은 부호(1비트) + 지수(11비트) + 가수(52비트)이기 때문에
    // 32비트인 int는 double의 가수 52비트보다 작기 때문에 어떠한 int 값이라도 손실 없이
    // double 타입으로 변환될 수 있다.
    
  }
}
