package chap06;

import chap06.util.Car2;

// 클래스 외부에서 메소드 호출

public class CarExample02 {

  public static void main(String[] args) {
    Car2 myCar = new Car2();
    myCar.keyTurnOn();
    myCar.run();
    int speed = myCar.getSpeed();
    System.out.println("현재 속도: " + speed + "km/h");
  }
}
