package chap03.practice;

public class SignOperatorExample {
  public static void main(String[] args) {
    
    int x = -100;
    int result1 = +x;
    int result2 = -x;
    System.out.println(result1);
    System.out.println(result2);
    
    short s = 100;
    //short result = -s; //컴파일 오류, 부호 연산자의 산출 타입은 int 타입이기 때문
    int result3 = -s;
    System.out.println(result3);

    
    
    

    
  }
}
