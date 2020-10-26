package scene.c3;

public class Outter {

  public void method(int arg) {
    int localVariable = 1;
    
      
      class Inner {
        public void method() {
          int result = arg + localVariable;
        }
      }
  }
}
