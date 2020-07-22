package sec06.exam01;

public class FloatDoubleExample {
  public static void main(String[] args) {
    //실수 리터럴을 float 변수에 그냥 저장할 수 없다.
    //실수 리터럴을 float 타입 변수에 저장하려면 리터럴 뒤에 f,F를 붙여야함

    double var1 =3.14;
    float var2 =3.14f;
    float var3 = 3.14F;
    
    System.out.println(var1);
    System.out.println(var2);
    System.out.println(var3);
    
    int var6 = 3000000;
    double var7 = 3e6;
    float var8 = 3e6f;
    double var9 = 2e-3;
    
    //만약 정수 리터럴에 10의 지수를 나타내는 E또는 e를 포함하고 있으면
    //정수 타입 변수에 저장할 수 없고 실수 타입 변수에 저장해야 한다.
    
    System.out.println(var6);
    System.out.println(var7);
    System.out.println(var8);
    System.out.println(var9);
    
  // double 변수가 float 변수보다 더 정밀하게 값이 저장됨
 // float는 4byte를 저장, double은 8byte를 저장하기 때문
  
  
  }
}
