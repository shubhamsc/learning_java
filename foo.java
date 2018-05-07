class Shape{
  protected int area(){
    System.out.println(1);
    return 0;
  };
}

class Square extends Shape{
  public static void main(String[] args) {
    Square shape = new Square();
    shape.area();
  }
}