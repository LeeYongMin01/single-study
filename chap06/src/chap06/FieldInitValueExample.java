package chap06;

import chap06.util.FieldInitValue;

public class FieldInitValueExample {
  public static void main(String[] args) {
    FieldInitValue fiv = new FieldInitValue();

    System.out.println("byteField: " + fiv.byteField);
    System.out.println("shortField: " + fiv.shortField);
    System.out.println("intField: " + fiv.intField);
    System.out.println("longField: " + fiv.longField);
    System.out.println("booleanField: " + fiv.booleanField);
    System.out.println("charField: " + fiv.charField);
    System.out.println("floatField: " + fiv.floatField);
    System.out.println("doubleField: " + fiv.doubleField);
    System.out.println("arrField: " + fiv.arrField);
    System.out.println("referenceField: " + fiv.referenceField);
  }
}

// util.FieldInitvalue로 선언한 필드의 기본값이 나온다.