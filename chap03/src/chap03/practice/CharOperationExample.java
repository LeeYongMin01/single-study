package chap03.practice;

public class CharOperationExample {
  public static void main(String[] args) {
    char c1 = 'A' + 1;
    char c2 = 'A';
    //char c3 = c2 +1; // 컴파일 에러
    System.out.println("c1: " + c1);
    System.out.println("c2: " + c2);

    // 변수 c2에 1을 더하면 c2는 int 타입으로 변환되고 1과 연산이 되기 때문에
    // 산출 타입은 int가 됨
    // 따라서 char 타입 변수 c3에 대입을 할 수 없어 컴파일 에러 발생
    
    //형변환으로 해결
    char c3 = (char) (c2 + 1);
    System.out.println("c3: " + c3);
  }
}
