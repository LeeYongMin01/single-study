package chap03.practice;

public class InputDataCheckNaNExample2 {

  // NaN 문자열은 산술 연산이 가능한데,
  // 연산되면 데이터가 엉망이 된다.
  // 따라서, 만약 NaN 값이 나온다면 산술 연살을 수행해서는 안된다.
  
  public static vodi main(String[] args) {
    String userInput = "NaN";
    double val = Double.valueOf(userInput);
    
    double currentBalance = 10000.0;
    
    if(Double.isNaN(val)) { //NaN을 검사 
      System.out.println("NaN이 입력되어 처리할 수 없음"); //
      val = 0.0;                                            // NaN일 경우 실행되는 코드
    }
    
    currentBalance += val; //currentBalance의 원래 값이 유지
    
    
    System.out.println(currentBalance);
  }
}

// NaN인지 조사를 할 때 == 연산자를 사용하면 안된다.
// NaN은 != 연산자를 제외한 모든 비교 연산자를 사용할 경우 false 값을 리턴하기 때문
