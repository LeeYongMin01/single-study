package chap04;

// 1~100 까지의 합을 출력

public class ForSumFrom1To100Example {
  public static void main(String[] args) {

   int sum = 0;

   // i가 for문 안에서 선언 되었다면
   // for문 밖에서는 사용할 수 없음

   for(int i = 1; i <=100; i++) {

     sum += i;
   }

   System.out.println("1~100의 합: " + sum);

   // 하지만 i가 for문 밖에서 선언되고 for문 안에서 사용되었다면,
   // for문 밖에서도 사용할 수 있다.

   sum = 0;
   int i = 0;
   for(i=1; i<=100; i++) {
     sum += i;
   }
   System.out.println("1~" + (i-1) + " 합 : " + sum);

  }
}


