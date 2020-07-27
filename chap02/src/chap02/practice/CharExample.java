package chap02.practice;

public class CharExample {
	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		int unicode = c1;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(unicode);
		
		String name = "홍길동";
		
		System.out.println(name);
		
		// char 변수로 단순히 초기화를 할 목적이라면 더블 쿼테이션과는 달리 싱글 쿼테이션은 사이에 공백을 주어야한다. ex) "",' '
		
	}
}
