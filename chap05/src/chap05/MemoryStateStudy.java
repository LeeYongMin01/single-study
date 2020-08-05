package chap05;

public class MemoryStateStudy {


  /*
  <메모리 사용 영역>
  java.exe로 JVM이 시작되면 JVM은 운영체제에서 할당받은 메모리 영역을
  세부 영역으로 구분해서 사용한다.
- 메소드 영역, 힙 영역, 스레드-JVM스택 영역

1) 메소드 영역
- 메소드 영역에는 코드에서 사용되는 ***클래스들***을 클래스별로
 필드 데이터, 메소드 데이터, 생성자 코드등을 분류해서 저장한다.
- 메소드 영역은 **JVM이 시작할 때 생성**되고 모든 스레드가 공유하는 영역

2) 힙(Heap) 영역
* 힙 영역은 객체와 배열이 생성되는 영역
* 힙 영역에 생성된 객체와 배열은 JVM 스택 영역의 변수나 다른 객체의 필드에서 **참조**한다.
- 참조하는 변수나 필드가 없다면, JVM은 의미 없는 객체인 쓰레기로 취급하고 힙 영역에서
자동으로 제거한다. 따라서, 객체 제거를 위해 별도의 코드를 작성할 필요가 없다.

3) JVM 스택 영역
- JVM 스택 영역은 각 스레드마다 하나씩 존재하며 스레드가 시작될 때 할당된다.
- 자바 프로그램에서 추가적으로 스레드를 생성하지 않았다면 main 스레드만 존재하므로
JVM 스택도 하나이다.
* JVM 스택은 메소드를 호출할 때마다 프레임을 추가하고 메소드가 종료되면 프레임을 제거하는
동작을 수행한다.
* 프레임 안에는 로컬 변수 스택이 있는데, 기본 타입 변수와 참조 타입 변수가 추가 되거나 제거된다.
- 최초로 변수에 값이 저장될 때=초기화가 될 때 , 프레임에 생성된다.
* 변수는 선언된 블록 안에서만 스택에 존재하고 블록을 벗어나면 스택에서 제거된다.

ex)if(v1 == 'A') {
int v2 = 100;
double v3 = 3.14;
}
- v2와 v3은 if 블록 내부가 실행되고 있을 때만 스택 영역에 존재하고
실행 흐름이 if 블록을 빠져나가면 소멸된다.


**기본 타입 변수는 스택 영역에 직접 값을 가지고 있지만, 참조 타입 변수는 값이 아니라
힙 영역이나 메소드 영역의 객체 주소값을 갖는다.
ex) int[] scores = {10, 20, 30};
-배열 변수인 scores는 스택 영역에 생성되지만 실제 10, 20, 30을 갖는 배열은 힙 영역에 생성됨
배열 변수 scores에는 배열의 힙 영역의 주소가 저장됨























   */
}