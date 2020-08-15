package scene.c3;

//<7.3> 부모 생성자 호출 - 자식 객체 이용

public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student("홍길동", "1234567-1234567", 1);
		System.out.println("name : " + student.name);//
		System.out.println("ssn : " + student.ssn);// <= 부모에게 불려받은 필드 출력
		System.out.println("studentNo : " + student.studentNo);
	}
}
