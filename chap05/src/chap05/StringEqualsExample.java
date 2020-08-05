package chap05;

public class StringEqualsExample {
  public static void main(String[] args) {
    String strVar1 = "이용민";
    String strVar2 = "이용민";

    if(strVar1 == strVar2) {
      System.out.println("1과 2는 참조가 같음");
    } else {
      System.out.println("1과 2는 참조가 다름");
    }


    if(strVar1.equals(strVar2)) {
      System.out.println("1과 2는 문자열이 같음");
    }

    String strVar3 = new String("이용민");
    String strVar4 = new String("이용민");

    if(strVar3 == strVar4) {
      System.out.println("3과 4는 참조가 같음");
    } else {
      System.out.println("3과 4는 참조가 다름");
    }

    if(strVar3.equals(strVar4)) {
      System.out.println("3과 4는 문자열이 같음");
    }

  }
}
