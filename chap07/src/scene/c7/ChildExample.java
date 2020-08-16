package scene.c7;

//<7.7> 타입 변환과 다형성 - 자동 타입 변환 후의 멤버 접근

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2();
		// parent.method3(); // 부모 클래스에 없기 때문에 호출 불가능
	}
}
