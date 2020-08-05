package chap05;

public class ArrayLengthExample {

  // 배열 길이
  // 배열의 길이란 배열에 저장할 수 있는 전체 항목 수
  // 배열변수.length; 를 이용하여 배열의 길이를 얻을 수 있음

  public static void main(String[] args) {

    int[] scores = {83, 90, 87};

    int sum = 0;
    for(int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }
System.out.println("총합: " + sum);

double avg = (double) sum / scores.length;
System.out.println("평균: " + avg);

  }
}
