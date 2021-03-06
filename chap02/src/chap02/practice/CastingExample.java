package chap02.practice;

public class CastingExample {
  public static void main(String[] args) {
    int intValue = 103029770;
    byte byteValue = (byte) intValue; //강제 타입 변환(캐스팅)
    
    //------------------------------------------
    
    long longValue = 300;
    int intValue2 = (int)longValue; // intValue2는 300이 그대로 저장된다.
    
    // int타입에 저장된 값이 유니코드 범위(0~65535)라면 char 연산자를 사용해서 char 타입으로
    // 변환 시킬 수 있다.
    
    int intValue3 ='A';
    char charValue = (char)intValue;
    System.out.println(charValue);
    
    // 실수 타입 (float,double)은 정수타입(byte,short,int,long)으로 자동 변환되지 않기 때문에
    // 강제 타입 변환을 사용해야만 한다. 이 경우, 소수점 이하 부분은 버려지고 정수 부분만 저장된다.
    
    double doubleValue = 3.14;
    int intValue4 = (int) doubleValue; // intValue4는 정수 부분인 3만 저장된다.
    
    
    
    
    
    
  }
}
