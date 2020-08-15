package scene.c4;

// <7.4> 메소드 재정의 - 부모 클래스

public class Calculator {
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return 3.14159 * r * r;
	}
}
