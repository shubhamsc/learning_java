class Letter {
  char c;
}
  
public class PassObject {
  public static void func(Letter y){
    y.c = 'Z';
  }
  public static void main(String[] args) {
    Letter l = new Letter();
    l.c = 'A';
    System.out.println("1:"+l.c);
    func(l);
    System.out.println("2:"+l.c);
  }
  
}