package chap05;

public class ArrayCreateByNewExample {

  //값의 목록을 가지고 있지는 않지만, 향후 값들을 저장할 배열을 미리 만들고 싶다면
  // new 연산자로 배열 객체를 생성 시킬 수 있음
  //타입[] 변수 = new 타입[길이];
  // new 연산자로 배열을 생성할 경우에는 이미 배열 변수가 선언 되었어도 가능
  //ex) int[] intArray = new int[5];
  //intArray 변수에는 주소값이 저장

  //배열에 새로운 값을 저장하려면 대입 연산자를 사용
  // 변수[인덱스] = 값;

  public static void main(String[] args) {
    int[] arr1 = new int[3];
    for(int i =0; i < 3; i++) {
      System.out.println("arr1[" + i + "] : " + arr1[i]);
    }
    arr1[0] = 10;
    arr1[1] = 20;
    arr1[2] = 30;
    for(int i = 0; i < 3; i++) {
      System.out.println("arr1[" + i + "] : " + arr1[i]);
    }

    double[] arr2 = new double[3];
    for(int i = 0; i < 3; i++) {
      System.out.println("arr2[" + i + "] : " + arr2[i]);
    }
    arr2[0] = 0.1;
    arr2[1] = 0.2;
    arr2[2] = 0.3;
    for(int i = 0; i < 3; i++) {
      System.out.println("arr2[" + i + "] : " + arr2[i]);
    }
    String[] arr3 = new String[3];
    for(int i=0; i < 3; i++) {
      System.out.println("arr3[" + i + "] : " + arr3[i]);
    }
    arr3[0] = "1월";
    arr3[1] = "2월";
    arr3[2] = "3월";
    for(int i =0; i < 3; i++) {
      System.out.println("arr3[" + i + "] : " + arr3[i]);
    }
  }

}
