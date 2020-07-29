package chap03.practice;

public class StringEqualsExample {

  
  // 동일한 String 객체이건 다른 String 객체이건 상관없이 String 객체의 문자열만을
  // 비교하고 싶다면 == 연산자 대신에 equals() 메소드를 사용
  
  public static void main(String[] args) {
    String strVar1 = "이용민";
    String strVar2 = "이용민";
    String strVar3 = new String("이용민");
    
    System.out.println(strVar1 == strVar2);
    System.out.println(strVar1 == strVar3);
    System.out.println();
    System.out.println(strVar1.equals(strVar2));
    System.out.println(strVar1.equals(strVar3));
    
    
    
  }
}
