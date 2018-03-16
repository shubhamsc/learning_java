/**
 * Asignment
 */ 
class Tank{
  int level;
}

public class Asignment {
  public static void main(String[] args) {
    Tank t1 = new Tank();
    Tank t2 = new Tank();
    t1.level = 9;
    t2.level = 47;
    System.out.println("1: level1 "+t1.level+",level2 "+t2.level);
    t1 = t2;
    System.out.println("1: level1 "+t1.level+",level2 "+t2.level);
    t1.level = 20;
    System.out.println("1: level1 "+t1.level+",level2 "+t2.level);
  }
  
}