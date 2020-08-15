package scene.c3;

//<7.3> 부모 생성자 호출 - 자식 클래스

public class Student extends People {
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) { // studentNo를 추가해서 생성 가능
		super(name, ssn); // 부모 생성자를 명시적으로 호출
		this.studentNo = studentNo;
	}
}
