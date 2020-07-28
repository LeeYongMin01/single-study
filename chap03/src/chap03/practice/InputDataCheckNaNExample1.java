package chap03.practice;

public class InputDataCheckNaNExample1 {
  // 부동소수점을 입력받을 때는 반드시 NaN 검사를 해야함
  
  public static void main(String[] args) {
    String userInput = "NaN"; // 사용자 입력 값
    double val = Double.valueOf(userInput); //  입력값을 double 타입으로 변환
    
    double currentBalance = 10000.0;
    
    currentBalance += val; // currentBalance라는 변수에 NaN이 저장됨
    
    System.out.println(currentBalance); 
  }
}
