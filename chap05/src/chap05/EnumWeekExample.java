package chap05;

import java.util.Calendar;

// 열거 타입 변수
// 열거 타입을 선언했다면 열거 타입을 사용할 수 있다.
// ex) 열거타입 변수;
// ex) Week reservationDay;
// 열거 타입을 선언 했으면 열거 상수를 저장
// ex) 열거 타입 변수 = 열거 타입.열거상수;
// ex) Week today = Week.SUNDAY; => today 변수에 SUNDAY값 저장
// => 열거 상수를 저장하면 method Area에 Week.class와 상수가 생성되고
// today는 스택 영역에 생성, 힙 영역에 있는 Week 객체를 참조하게됨
// today에는 Week.SUNDAY 객체의 번지값이 저장됨



public class EnumWeekExample {
	public static void main(String[] args) {
		Week today = null; // 열거 타입 변수 선언
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK); // 일~토 까지의 숫자를 리턴해줌
		
		switch(week) {
		case 1:
			today = Week.SUNDAY; 
			break; // 열거 상수 대입
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5: 
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		System.out.println("오늘 요일: " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부합니다");
		}
		
	}
	
}
