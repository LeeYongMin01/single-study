package chap03.practice;

public class InfinityAndNaNCheckExample {
  
  // 정수는 0으로 나눌 수 없는데 
  // 컴파일은 정상적으로 되지만 예외(ArithmeticException)이 발생한다.
  
  // NaN = Not a Number
  // Infinity = 무한대
  // 이 두개의 값이 나오면 연산을 더 진행하면 안됨. 데이터가 엉망이 될 수 있음
  
  // %와 /의 결과가 NaN 또는 Infinity인지 확인하려면 Double.isInfinite(), Double.isNaN() 메소드를
  // 이용하면 됨
  
  
  public static void main(String[] args) {
    int x = 5;
    double y = 0.0;
    
    double z = x / y;
    //double z = x % y;
    
   if(Double.isInfinite(z) || Double.isNaN(z)) {
     System.out.println("값 산출 불가");
   } else {
     System.out.println(z + 2);
   }
    
    
    
  }
  
  
}
