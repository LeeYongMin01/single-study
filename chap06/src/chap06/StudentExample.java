package chap06;

import chap06.util.Student;

public class StudentExample {

	
// 클래스로부터 객체를 생성하기 위해서는 new 연산자를 사용
// new 클래스();
// => new는 클래스로부터 객체를 생성시키는 연산자다.
// new 연산자로 생성된 객체는 힙 영역에 생성된다.
// new 연산자는 힙 영역에 객체를 생성시킨 후, 객체의 주소를 리턴한다.
// 리턴된 객체의 주소를 참조 타입인 클래스 변수에 저장해두고
// 변수를 통해 객체를 사용하는 것
// => 클래스 변수;
//	변수 = new 클래스();
// => 클래스 변수 = new 클래스();	
public static void main(String[] args) {
	Student s1 = new Student();
	System.out.println("s1변수가 Student 객체를 참조합니다");
	
	Student s2 = new Student();
	System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다");
	
}

// Student 클래스는 하나지만 new 연산자를 사용한 만큼 객체가 메모리에 저장됨
// 이러한 객체들은 Student 클래스의 인스턴스들이다.
// 같은 클래스로부터 생성되었지만 각각의 Student 객체는 
// 자신만의 고유 데이터를 가지면서 메모리에서 활동하게 된다.
// s1과 s2가 참조하는 Student 객체는 다른 객체이다.


// 클래스는 2가지 용도가 있다.
// 1) 라이브러리 (API)용
// 다른 클래스에서 이용할 목적으로 설계된다.
// 2) 실행 클래스
// 프로그램 실행 진입점인 main() 메소드를 제공하는 역할을 한다.
// Student는 라이브러리 클래스, StudentExample이 실행 클래스이다.






}
