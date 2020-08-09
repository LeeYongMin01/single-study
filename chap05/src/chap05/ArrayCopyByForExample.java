package chap05;

	// 배열은 한 번 생성하면 크기를 변경할 수 없기 때문에
	// 더 큰 공간이 필욯다면 더 큰 배열을 새로 만들고 
	// 이전 배열로부터 값을 복사해야함
	// => for문을 사용하거나 System.arraycopy() 메소드를 이용한다.
	
// 1) for문 사용

public class ArrayCopyByForExample {
	public static void main(String[] args) {
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		for(int i = 0; i <oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for(int i = 0; i <newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
	
		}
	}

	
	
	

	
}
