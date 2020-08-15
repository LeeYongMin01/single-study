package scene.c2;

// <7.2> 클래스 상속 - 자식 클래스

public class DmbCellPhone extends CellPhone {
	// 필드
	int channel;
	
	// 생성자
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;   // <= 부모클래스 CellPhone 으로부터 상속받은 필드
	}
	
	// 메소드
	void turnOnDmb() { 
		System.out.println("채널 " + channel + "번 Dmb 방송 수신을 시작합니다");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번 으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("Dmb 방송 수신을 멈춥니다.");
	}
}
