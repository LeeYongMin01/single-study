package scene.c7;

//<7.7.4> 매개 변수의 다형성 - Vehicle을 이용하는 클래스

public class Driver {
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
}
