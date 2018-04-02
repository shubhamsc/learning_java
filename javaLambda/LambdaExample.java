/**
 * lambdaExample
 */
public class LambdaExample {
  public static void main(String[] args) {
    int a = 10;
    Drawable d = new Drawable(){
      public void draw(){
        System.out.println("hello" + a);
      }
    };
    d.draw();
  }
  
}