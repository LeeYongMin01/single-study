package scene.c7;

//<7.7> 타입 변환과 다형성 - 자동 타입 변환 후의 멤버 접근

public class Child extends Parent {
	@Override
	public void method2() {
		System.out.println("Child-method2()"); // 메소드 재정의
	}
	public void method3() {
		System.out.println("Child-method3");
	}
}
