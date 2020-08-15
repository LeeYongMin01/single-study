package scene.c4;

// <7.4> 메소드 재정의 - 자식 클래스

public class Computer extends Calculator {
	@Override 
	double areaCircle(double r) {
		System.out.println("computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
