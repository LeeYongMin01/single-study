package chap05;

public class MainStringArrayArgument {




/*
 java 클래스로 프로그램을 실행하면 JVM은 길이가 0 인 String 배열을 먼저 생성하고
 main() 메서드를 호출할 때 매개값으로 전달한다.
 String[] args = {}; ==> main() 메소드 호출 시 전달 ==> public static void main(String[] args)
=> main() 메소드는 String[] args 매개 변수를 통해서 배열의 길이와 배열의 항목 값을
알 수 있게 된다.
*/


  public static void main(String[] args) {
    if(args.length != 2) { // 배열에 입력된 데이터 개수가 2개가 아닐 경우
      System.out.println("프로그램의 사용법");
      System.out.println("java MainStringArrayArgument num1 num2");
      System.exit(0); // 프로그램 강제 종료
    }


    String strNum1 = args[0]; // 첫번째 데이터 얻기
    String strNum2 = args[1]; // 두번째 데이터 얻기

    int num1 = Integer.parseInt(strNum1); // 문자열을 정수로 변환
    int num2 = Integer.parseInt(strNum2); // 문자열을 정수로 변환

    int result = num1 + num2;
    System.out.println(num1 + " + " + num2 + " = " + result);

  }
// 매개값을 주지 않았기 때문에 길이 0인 String 배열이 매개값으로 전달됨

















}