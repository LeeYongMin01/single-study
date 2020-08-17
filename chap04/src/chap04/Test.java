package chap04;

import java.util.Scanner;

// <확인문제 7번>


public class Test {
  public static void main(String[] args) {
    boolean run = true;

    int balance = 0;

    Scanner scanner = new Scanner(System.in);

    while(run) {
      System.out.println("-------------------------------");
      System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
      System.out.println("-------------------------------");
      System.out.println("선택> ");

      int num = scanner.nextInt();
      if(num == 1) {
        System.out.print("예금액> ");
        balance += scanner.nextInt();
      }
      else if (num == 2) {
        System.out.print("출금액> ");
        balance -= scanner.nextInt();
      }
      else if (num == 3) {
        System.out.print("잔고> ");
        System.out.println(balance);
      }
      else if (num == 4) {
        break;

      }

    }
    System.out.println("프로그램 종료");
  }

}
