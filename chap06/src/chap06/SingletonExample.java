package chap06;

import chap06.util.Singleton;

// 싱글톤 객체

public class SingletonExample {
	public static void main(String[] args) {
//		Singleton obj1 = new Singleton(); // 오류, new를 이용하여 객체 생성 불가

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
	}
	
}
