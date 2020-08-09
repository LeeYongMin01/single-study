package chap06.util;

// Car 클래스 필드 선언

public class Car {

  // 필드
  public String company = "현대자동차";
  public String model;
  public String color;
  public int maxSpeed;
  







// 생성자
  public Car(){
  }	//생성자 1
  
  public Car(String model){
//	  this.model = model;  // 생성자 2 
	  this(model, "은색", 250);
  }
  
  public Car(String model, String color) {
//	  this.color = color; // 생성자 3
	  this(model, "은색", 250);
  }
  
  public Car(String model, String color, int maxSpeed) {
	  this.model = model;
	  this.color = color;
	  this.maxSpeed = maxSpeed;	// 생성자 4
  }
}
