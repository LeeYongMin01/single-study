package chap05;

	//배열은 한 번 생성하면 크기를 변경할 수 없기 때문에
	// 더 큰 공간이 필욯다면 더 큰 배열을 새로 만들고 
	// 이전 배열로부터 값을 복사해야함
	// => for문을 사용하거나 System.arraycopy() 메소드를 이용한다.

// 2) System.arraycopy() 메소드 이용

// System.arraycopy() 호출
// System.arraycopy(object src, int srcPos, Object dest, int destPos, int length);
// src 매개값은 원본 배열, srcPos는 원본 배열에서 복사할 항목의 시작 인덱스
// dest 매개값은 새 배열, destPos는 새 배열에서 붙여넣을 시작 인덱스
// ex) System.arraycopy(arr1, 0, arr2, 0, arr1.length);

public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ",");
		}
		
	}
}
