package chap06;

// final 필드 테스트

import chap06.util.Person;

public class PersonExample {
  public static void main(String[] args) {
    Person p1 = new Person("123456-1234567", "계백");

    System.out.println(p1.nation);
    System.out.println(p1.ssn);
    System.out.println(p1.name);

    //p1.nation = "usa";        //
    //p1.ssn ="654321-7654321"; // final 필드는 수정 불가

    p1.name = "을지문덕";

  }
}