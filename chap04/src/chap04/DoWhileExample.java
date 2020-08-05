package chap04;

import java.util.Scanner;

public class DoWhileExample {
  public static void main(String[] args) {
  //for문은 정해진 횟수만큼 반복을 사용할 경우
  //while문은 조건식을 사용하여 반복을 사용할 경우
  //do~while문은 실행문을 우선 실행시키고 결과에 따라서 반복 실행을 할지말지 결정하는 경우
  System.out.println("메시지를 입력하세요");
  System.out.println("프로그램을 종료하려면 q를 입력하세요");

  Scanner scan = new Scanner(System.in); // Scanner 객체 생성
  String inputString;


  do {
    System.out.println(">");
    inputString = scan.nextLine(); // 키보드로 입력한 문자열을 얻음
    System.out.println(inputString);
  } while(! inputString.equals("q"));

  System.out.println();
  System.out.println("프로그램 종료");
  }
}
