package chap05;

public class ArrayCreateByValueListExample1 {

  //배열은 같은 타입의 데이터만 저장 가능
  // 한번 생성된 배열은 길이를 늘리거나 줄일 수 없다.

  // 배열 변수는 참조 변수
  // => 배열도 객체이기 때문에 힙 영역에 생성되고 배열변수는 힙 영역의 배열 객체를 참조하게 됨

  public static void main(String[] args) {
    int[] scores = {83, 90, 87};
    System.out.println("scores[0] : " + scores[0]);
    System.out.println("scores[1] : " + scores[1]);
    System.out.println("scores[1] : " + scores[2]);


    int sum = 0;
    for(int i = 0; i < 3; i++) {
      sum += scores[i];
    }
    System.out.println("총합 : " + sum);
    double avg = (double) sum / 3;
    System.out.println("평균 : " + avg);

  }
}

// 배열 변수를 미리 선언한 후, 값 목록들이 나중에 결정되는 상황이라면 new 연산자를 사용
// ex) 변수 = new 타입[] {값0, 값1 ,...};
//ex) String[] names = null;
//names = new String[] {"ㅁㄴㅇ", "ㅂㅈㄷ", "ㅋㅌㅊ"};
