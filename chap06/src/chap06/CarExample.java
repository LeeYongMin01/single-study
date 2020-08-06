package chap06;

// 외부 클래스에서 Car 필드값 읽기와 변경

public class CarExample {

// <클래스의 구성 멤버>
// 1. 필드
// 필드는 객체의 고유 데이터, 부품 객체, 상태 정보를 저장하는 곳
// 필드는 생성자와 메소드 전체에서 사용되고 객체가 소멸되지 않는 한 객체와 함께 존재한다.

// 1-1) 필드
// 필드 선언은 변수의 선언 형태와 비슷
// 변수는 자신이 선언된 생성자, 메소드 블록 내부에서만 사용이 가능하지만,
// 필드는 생성자와 모든 메소드에서 사용 가능

// 타입 필드 [= 초기값];
// 타입 필드에는 기본타입, 참조타입이 모두 올 수 있다.
// ex) String company = "현대자동차";, int currentSpeed;


/*  public static void main(String[] args) {
    // 객체 생성

    Car myCar = new Car();

    // 필드값 읽기
    System.out.println("제작회사: " + myCar.company);
    System.out.println("모델명: " + myCar.model);
    System.out.println("색깔: " + myCar.color);
    System.out.println("최고속도: " + myCar.maxSpeed);
    System.out.println("현재속도: " + myCar.speed);

    // 필드값 변경
    myCar.speed = 60;
    System.out.println("수정된 속도: " + myCar.speed);
  }
*/



// 2. 생성자
// new 연산자로 호출되는 특별한 중괄호다.
// 생성자의 역할은 객체생성 시 초기화를 담당
// 필드를 초기화하거나 메소드를 호출해서 객체를 사용할 준비를 한다.
// new 연산자에 의해 생성자가 성공적으로 실행되어야 heap 영역에 객체가 생성되고
// 객체의 주소가 리턴되는 것

// 2-1) 기본 생성자
// 모든 클래스에 생성자가 존재하며 한 개 이상을 가질 수 있다.
// 생성자 생성을 생략했다면 컴파일러가 자동으로 추가시킨다.
// 클래스가 public class로 선언되면 기본 생성자에서도 public이 붙지만, 클래스가 public 없이
// class로만 선언되면 기본 생성자에도 public이 붙지 않는다.

// ex) <소스파일> (Car.java)           =>      <바이트 코드 파일> (Car.class)
//      public class Car{}                  public class Car {
//                                            public Car() {} // 자동 추가
//                                              }

// => 클래스에 생성자를 선언하지 않아도 다음과 같이 new 연산자 뒤에 기본 생성자를 호출해서
// 객채를 생성시킬 수 있다.

//  Car myCar = new Car();
  // new Car의 Car()가 기본 생성자

// 2-2) 생성자 선언
// 생성자는 메소드와 비슷한 모양을 가지고 있으나, 리턴 타입이 없고 클래스 이름과 동일하다.
// 생성자 블록 내부에는 객체 초기화 코드가 작성되는데, 일반적으로 필드에 초기값을 저장하거나
// 메소드를 호출하여 객체 사용 전에 필요한 준비를 한다.

// 매개 변수 선언은 생략할 수도 있고, 여러개를 선언할 수도 있다.
// Car 생성자를 호출할 때 세 개의 값을 제공한다고 보자.
// ex) Car myCar = new Car("그렌져, "검정", 300); <= 두개는 String 타입, 한개는 int 타입
// 세 매개값을 생성자가 받기 위해서는 이렇게 선언해야 한다.
// ex) public class Car{
// 생성자
//   Car(String model, String color, int maxSpeed)
//}

//  Car myCar = new Car("검정", 3000); <= color에 검정을 받고 cc에 3000을 받음
  // Car myCar = new Car(); // 기본 생성자를 호출할 수 없음



















// 3. 메소드
// 객체의 동작에 해당하는 중괄호
// 객체간의 데이터 전달의 수단으로 사용
// 외부로부터 매개값을 받을 수도 있고, 실행 후 값을 리턴할 수도 있다.

























}
