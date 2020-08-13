package chap06.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 어노테이션 정의

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)

public @interface PrintAnnotation {
  String value() default "-";
  int number() default 15;
}
  /*
  어노테이션은 메타데이터라고 볼 수 있다.
  메타데이터는 컴파일 과정과 실행 과정에서 코드를 어떻게 컴파일하고 처리할 것인지 알려주는 정보

  어노테이션은 3가지 용도로 사용된다.
  1) 컴파일러에게 코드 문법 에러를 체크하도록 정보를 제공
  2) 소프트웨어 개발 툴이 빌드나 배치 시 코드를 자동으로 생성할 수 있도록 정보를 제공
  3) 실행 시 ( 런타임) 특정 기능을 실행하도록 정보를 제공

  Ex) @Override


  1)어노테이션을 정의하는 법
  @interface를 사용
  ex) public @interface AnnotationName{} => 정의한 어노테이션은 @AnnotationName 으로 사용

  어노테이션은 엘리먼트를 멤버로 가질 수 있다.
  엘리먼트 - 기본 데이터 타입이나 String, 열거, Class타입, 배열 타입
  메소드처럼 ()를 붙여야함
  ex) public @interface AnnotationName {
    String elementName1();
    int elementName2() default 5;
    }
    디폴트 값이 없으면 반드시 값을 기술해야한다.



    어노테이션이 적용될 대상을 지정할 때에는 @Target 어노테이션을 사용한다.



  2) 어노테이션 유지 정책
  어노테이션 정의 시 추가해야 할 내용은 사용 용도에 따라 @AnnotationName을 어느 범위까지
  유지할 것인지 지정해야 한다.
  (1) SOURCE - 소스상에서만 어노테이션 정보를 유지
  (2) CLASS - 바이트 코드 파일까지 어노테이션 정보를 유지, 리플렉션을 이용하여 정보를 얻을 수는
  없다.
  (3) RUNTIME - 바이트 코드 파일까지 어노테이션 정보를 유지하면서 리플렉션을 이용하여 런타임 시
  어노테이션 정보를 얻을 수 있다.
  *****리플렉션 - 런타임 시에 클래스의 메타 정보를 얻는 기능
  => 클래스가 가지고 있는 필드가 무엇인지, 어떤 생성자를 가지고 있는지 등등을 알아내는 것

  @Retention을 사용하여 유지 정책을 지정
  ex)
  @Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
  @Retention(RetentionPolicy.RUNTIME)
  public @interface AnnotationName{}


  3) 런타임 시 어노테이션 정보 사용하기
  어노테이션 자체는 동작을 가지지 않는 표식일 뿐이지만, 리플렉션을 이용해서
  어노테이션의 적용 여부와 엘리먼트 값을 읽고 적절히 처리할 수 있다.





  */



