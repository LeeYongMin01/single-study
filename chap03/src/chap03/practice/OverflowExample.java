package chap03.practice;

public class OverflowExample {
  public static void main(String[] args) {
    int x = 1000000;
    int y = 1000000;
    int z = x * y;
    System.out.println(z);
  
    // int가 담을 수 있는 값을 초과. 그래서 쓰레기값을 얻게 됨
    // 이것을 오버플로우라 부름
    // 해결법) 데이터 타입을 변경
    
  
    long x1 = 1000000;
    long y1 = 1000000;
    long z1 = x1 * y1;
    System.out.println(z1);
    
    
    
    
    
    
  }
  
  
}
