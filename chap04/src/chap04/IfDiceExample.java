package chap04;

// 주사위의 번호를 뽑는 예제
// 1-6중에서 하나의 수를 뽑아서 출력
// Math.random() 메소드를 활용

// Math.random() 메소드는 0.0~1.0 사이에 속하는 double 타입의 난수 하나를 리턴함
// ex) 1~10 정수 중에서 하나의 정수를 얻기 위한 과정
// 0.0 <= Math.random() < 1.0
// 0.0 * 10 <= Math.random() * 10 < 1.0 * 10     ==> 각 변에 10을 곱함
// (0)         (0,1,2,...9)          (10)
//(int) 0.0 <= (int)(Math.random()*10) <(int) 10.0 ==> 각 변을 정수로 만들기 위해 강제 타입 변환
//0+1 <= (int)(Math.random()*10) +1 < 10+1 // 각 변에 1을 더함으로서 정수를 얻음

public class IfDiceExample {
  public static void main(String[] args) {
    int num = (int)(Math.random()* 6) + 1; // 주사위 번호 하나 뽑기

    if(num == 1) {
      System.out.println("1번");
    } else if(num == 2){
      System.out.println("2번");
    } else if(num == 3){
      System.out.println("3번");
    } else if(num == 4){
      System.out.println("4번");
    } else if(num == 5){
      System.out.println("5번");
    } else {
      System.out.println("6번");
    }

  }
}
