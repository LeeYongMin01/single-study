package chap02.practice;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 1000000000000; - 컴파일 에러, 이유) 데이터 값을 초과했기 때문에. 
		// 컴파일러는 기본으로 4byte 형식을 제공하는데, 8byte임을 알려주기 위해 뒤에 L을 붙여야 컴파일이 가능하다.
		
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		
		
	}
}
