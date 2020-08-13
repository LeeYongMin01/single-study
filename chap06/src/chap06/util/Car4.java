package chap06.util;

// Getter / Setter

public class Car4 {


  // 일반적으로 객체의 데이터는 객체 외부에서 직접적으로 접근하는 것을 막는다.
  // 이유 : 외부의 접근을 허용하면 객체의 무결성이 깨질 수 있기 때문

  // = > 그래서 메소드를 통해 데이터를 변경하는 방법을 선호
  // 클래스는 막고 메소드를 열어 외부에서 메소드를 통해 데이터에 접근하도록 유도
  // 이유 : 메소드는 매개값을 검증해서 유효한 값만 데이터로 저장할 수 있기 때문
  // 이 역할을 하는 메소드가 Setter

  // 외부에서 객체의 데이터를 읽을 때도 메소드를 사용하는 것이 좋다.
  // 메소드로 필드값을 가공하여 외부로 전달하는데
  // 이 역할을 하는 메소드가 Getter

  // 필드를 private으로 선언하여 외부로부터 보호하고, 필드에 대한 Getter/Setter 메소드를
  // 이용하여 필드값을 안전하게 변경/사용 하는 것이 좋다.

  // 외부에서 필드값을 읽을 수만 있고 변경하지 못하도록 하려면 Getter 메소드만 선언

// ------------------------------------------------------------------------------------------
  // 필드
  private int speed;
  private boolean stop;

  // 생성자

  // 메소드
  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    if(speed < 0) {
      this.speed = 0;
      return;
    } else {
      this.speed = speed;
    }
  }

  public boolean isStop() {
    return stop;
  }

  public void setStop(boolean stop) {
    this.stop = stop;
    this.speed = 0;
  }
}
