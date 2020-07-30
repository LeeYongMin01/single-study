package chap04;


// if문의 블록 내부에 또 다른 if문을 쓰는 것 = 중첩 if문
// 코드의 실행 흐름을 이해하는 것이 중요

// 81~100 사이에 속하는 점수를 뽑아내어
// 바깥 if 문은 90,80점을 기준으로.
// 중첩 if 문은 세부적으로 95, 85점을 기준으로 조건문 작성

public class IfNestedExample {
  public static void main(String[] args) {
    int score = (int)(Math.random()* 20) + 81;
    System.out.println("점수: " + score);

    String grade;

    if(score>=90) {
      if(score>=95) {
        grade = "A+";
      } else {
        grade = "A";
      }
      } else {
        if(score>=85) {
          grade = "B+";
      } else {
        grade = "B";
      }
    }
    System.out.println("학점: " + grade);
    }
}



