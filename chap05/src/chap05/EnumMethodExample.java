package chap05;


// Enum 클래스의 메소드
// 1) name() 메소드
// name() 메소드는 열거 객체가 가지고 있는 문자열을 리턴한다.
// 리턴되는 문자열은 열거 타입을 정의할 때 사용한 상수 이름과 동일

// 2) ordinal() 메소드
// 전체 열거 객체 중 몇번째 열거 객체인지 알려준다.
// 0번부터 시작하고 들어간 순서대로 순번이 주어짐

// 3) compareTo() 메소드
// 매개값으로 주어진 열거 객체를 기준으로 전후로 몇 번째 위치하는지를 비교
// 열거 객체가 매개값의 열거 객체보다 순번이 빠르다면 음수, 늦으면 양수가 리턴

// 4) valueOf() 메소드
// 매개값으로 주어지는 문자열과 동일한 문자열을 가지는 열거 객체를 리턴
// 외부로부터 문자열을 입력받아 열거 객체로 변환할 때 유용하게 사용할 수 있음

// 5) values() 메소드
// 열거 타입의 모든 열거 객체들을 배열로 만들어 리턴

public class EnumMethodExample {
	 public static void main(String[] args) {
		 //name() 메소드
		 Week today = Week.SUNDAY;
		 String name = today.name();
		 System.out.println(name);
		 
		 //ordinal()
		 Week today1 = Week.SUNDAY;
		 int ordinal = today1.ordinal();
		 System.out.println(ordinal);

		 //compareTo()
		 Week day1 = Week.MONDAY;
		 Week day2 = Week.WEDNESDAY;
		 int result1 = day1.compareTo(day2);
		 int result2 = day2.compareTo(day1);
		 System.out.println(result1);
		 System.out.println(result2);

		 //valueOf()
		 if(args.length == 1) {
			 String strDay = args[0];
			 Week weekDay = Week.valueOf(strDay);
			 if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				 System.out.println("주말");
			 } else {
				 System.out.println("평일");
			 }
		 }
		 
		 
		 //values()
		 Week[] days = Week.values();
		 for(Week day : days) {
			 System.out.println(day);
		 }
		 
	 
	 
	 
	 }
	
}
