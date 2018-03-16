import java.util.Properties;
import java.util.*;

class AreaCalculator {
  public static void printArea(Shape shape){
    System.out.println(shape.area());
  }
  public static void printPerimeter(Rectangle rect){
    System.out.println(rect.perimeter());
  }
  public static void main(String[] args) {
    FileReader reader = new FileReader(message.properties);
    Properties prop = new Properties();
    System.out.println();
    printArea(new Rectangle(5,4));
    printArea(new Square(3));
    printPerimeter(new Square(3));
    printPerimeter(new Rectangle(5,4));
  }
}