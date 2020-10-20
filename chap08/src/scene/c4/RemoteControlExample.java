package scene.c4;

import scene.c2.RemoteControl;
import scene.c3.Television;

public class RemoteControlExample {
  public static void main(String[] args) {

    RemoteControl rc = null;

    rc = new Television();
    rc.turnOn();
    rc.turnOff();
    rc.setMute(true);

    rc = new Audio();
    rc.turnOn();
    rc.turnOff();
    rc.setMute(true);

  }
}
