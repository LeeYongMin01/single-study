package chap03.practice;

public class AccuracyExample1 {
  public static void main(String[] args) {
    int apple = 1;
    double pieceUnit = 0.1;
    int number = 7;
    
    double result = apple - number*pieceUnit;
    
    System.out.println("사과 한개에서");
    System.out.println("0.7조각을 빼면");
    System.out.println(result + "조각이 남는다");
    // 기대값 0.3
    // 결과값 0.29999999999999993
    // 이유)
    // 이진 포맷을 사용하는 부동소수점 타입(float, double)은 0.1을 정확히 표현할 수 없음
    // 따라서, 근사치로 표현함
    
    
  }
}
