package scene.c7;

//<7.7.4> 매개 변수의 다형성 - 자식 클래스

public class Bus extends Vehicle {
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}
