package chap05;


// 향상된 For 문
// ex) for( 타입 변수 : 배열){
//        실행문;
// }

public class AdvancedForExample {
	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 87};
		
		int sum =0;
		for (int score : scores) {
			sum += score;
			
		}
		
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);
	}
	
	
}
