package chap02.practice;

public class PromotionExample {
  public static void main(String[] args) {
    //자동 타입 변환 => 데이터 타입 선언으로 기존 데이터 타입을 변환시킴
    //ex) byte byteValue =10; 
    // int intValue = byteValue;
    // byteValue는 byte 타입이라 1byte를 저장하지만 int데이터 변수에 의해 4byte로 변환됨
    
    //***단 하나의 예외가 있는데, char는 2byte의 크기를 가지지만 범위가 0~65535이므로
    // 음수가 올 수 없음. 따라서 음수가 저장될 수 있는 byte타입을 char타입으로 변환 불가
    
    byte byteValue = 10;
    int intValue = byteValue; // int <- byte
    System.out.println(intValue);
    
    char charValue = '가';
    intValue = charValue; // int <- char
    System.out.println("가의 유니코드=" + intValue);
    
    intValue = 500;
    long longValue = intValue; // long <- int
    System.out.println(longValue);
    
    intValue = 200;
    double doubleValue = intValue; // double <- int
    System.out.println(doubleValue);
    // long과 double은 8byte를 저장한다는 점에서 같지만,
    // long은 정수를 저장하고 double은 실수를 저장함
    // 실수 데이터 = 소수점을 가진 숫자를 저장할 수 있음
  }
}
