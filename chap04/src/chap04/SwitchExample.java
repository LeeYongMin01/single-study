package chap04;

// switch문은 if문과 다르게 true,false 논리 연산자를 이용하여
// 실행문을 실행하는 것이 아니라 변수가 어떤 값을 갖느냐에 따라 실행문이 선택됨


//IfDiceExample을 switch문으로

public class SwitchExample {
  public static void main(String[] args) {
    int num = (int)(Math.random()*6) + 1; // 주사위 번호 1이상 뽑기

    switch(num) {
      case 1:
        System.out.println("1번");
        break;
      case 2:
        System.out.println("2번");
        break;
      case 3:
        System.out.println("3번");
        break;
      case 4:
        System.out.println("4번");
        break;
      case 5:
        System.out.println("5번");
        break;
      default:
        System.out.println("6번");
        break;


    }

  }
}
