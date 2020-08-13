package chap06;

import chap06.util.Car4;

// Getter / Setter


public class CarExample04 {
  public static void main(String[] args) {
    Car4 myCar = new Car4();

    // 잘못된 속도 변경
    myCar.setSpeed(-50);

    System.out.println("현재 속도: " + myCar.getSpeed());

    // 올바른 속도 변경
    myCar.setSpeed(60);
    System.out.println("현재 속도: " + myCar.getSpeed());


    // 멈춤
    if(!myCar.isStop()) {
      myCar.setStop(true);
    }
    System.out.println("현재 속도: " + myCar.getSpeed());

    }




}
