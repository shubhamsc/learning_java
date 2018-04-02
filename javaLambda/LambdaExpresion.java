public class LambdaExpresion {
  public static void main(String[] args) {
    int a = 10;
    Drawable d = ()->{
      System.out.println("hello" + a);
    };
    d.draw();
  }
  
}