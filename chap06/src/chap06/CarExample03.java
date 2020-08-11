package chap06;

import chap06.util.Car3;

// 인스턴스 멤버와 this

public class CarExample03 {
  public static void main(String[] args) {
    Car3 myCar = new Car3("볼보");
    Car3 yourCar = new Car3("벤츠");

    myCar.run();
    yourCar.run();
  }
}
