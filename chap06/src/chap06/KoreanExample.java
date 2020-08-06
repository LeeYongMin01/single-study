package chap06;

import chap06.util.Korean;

public class KoreanExample {


  // 클래스로부터 객체가 생성될 때 필드는 기본 초기값으로 자동 설정된다.
  // 다른 값으로 초기화를 하고 싶다면 2가지 방법이 있다.
  // 1) 필드를 선언할 때 초기값을 주는 방법
  // 2) 생성자에서 초기값을 주는 방법


//ex)
//  public class Korean {
//  String nation = "대한민국";
//  String name;
//  String ssn;
//  }
//  여기서 Korean 클래스로부터 k1과 k2 객체를 생성하면 k1,k2 객체의 nation 필드에는 "대한민국"
// 이 저장되어 있다.
//  Korean k1 = new Korean();
//  Korean k2 = new Korean();

public static void main(String[] args) {
  Korean k1 = new Korean("박자바", "011225-1234567");
  System.out.println("k1.name : " + k1.name);
  System.out.println("k2.ssn: " + k1.ssn);

  Korean k2 = new Korean("김자바", "930525-0612323");
  System.out.println("k2.name: " + k2.name);
  System.out.println("k2.ssn: " + k2.ssn);
}

// Korean 생성자의 매개 변수 이름은 n,s를 사용했는데
// 가능하면 초기화시킬 필드 이름과 비슷하거나 동일한 이름(name, ssn)을 사용해야한다.
// 이 경우, 필드와 매개변수의 이름이 동일하기 때문에 생성자 내부에서 해당 필드에 접근할 수 없다.
// 해결방법은 필드 앞에 this. 를 붙이면 된다.
// this는 객체 자신의 참조인데, 객체가 객체 자신을 this로 알려주는 것이다.
// "this.필드" 는 this 라는 참조 변수로 필드를 사용하는 것과 동일하다.
// =>  public Korean(String name, String ssn) {
//      this.name = name;
//      this.ssn = ssn;
//}

// 객체의 필드는 하나가 아니라 여러개기 때문에 필드를 모두 생성자에서 초기화 한다면
// 생성자 매개변수의 수도 필드 수만큼 선언되야한다.
// 실제로는 중요한 필드 몇개만 매개 변수를 통해 초기화되고 나머지 필드들은 필드 선언 시에
// 초기화하거나 생성자 내부에서 임의의 값 또는 계산된 값으로 초기화한다.






}
