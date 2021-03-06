package chap02.practice;

public class OperationsPromotionExample2 {
  public static void main(String[] args) {
    int intValue = 10;
    double doubleValue = 5.5;
    double result = intValue + doubleValue;
    System.out.println(result);
    
    //자바는 정수 연산일 경우 기본으로 int 타입을 사용한다.
    //따라서, 4byte보다 작은 타입 byte,char,short 는 int 타입으로 변환된 후 연산이 수행됨
    
    char ai = 'A';
    int result1 = ai +1;
    char na = (char)result1;
    System.out.print(na);
    
    // 만약 피연산자 중 하나가 long 타입이라면 다른 피연산자도 long 타입으로 자동 타입 변환되고
    // 연산의 결과는 long 타입이 된다.
    
    // float + float 타입은 float타입으로 나온다.
    // 피연산자 중에 실수 리터럴이나 double 타입이 있다면 다른 피연산자도 double 타입으로
    // 자동 타입 변환되어 연산되므로 결과는 double 타입으로 산출된다.
    
    

    
    
  }
  
}
