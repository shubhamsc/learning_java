import java.util.*;

/**
 * LambdaForEach
 */
public class LambdaForEach {
  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    list.add("Debu");
    list.add("Pandey");
    list.add("Ghamand");
    list.add("Swag");
    list.forEach((n)->System.out.println(n));
  }
}