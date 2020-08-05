package chap04;

public class ContinueExample {

  //continue 문은 for문의 증감식, while,do-while문의 조건식으로 이동함
  //if문에 주로 사용되는데, continue문 이후의 문장을 실행하지 않고
  // 다음 반복으로 넘어가고 싶을 때 사용

  public static void main(String[] args) {
    for(int i = 1; i <= 10; i++) {
      if(i%2 != 0) { // 2로 나눴을 때 나머지가 0이 아닌경우 = 홀수인 경우
        continue;
    }
    System.out.println(i);
  }

  }
}


