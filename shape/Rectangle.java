class Rectangle extends Shape{
  private final float length;
  private final float width;
  Rectangle(float length,float width){
    this.length = length;
    this.width = width;
  }
  public float area(){
    return length*width;
  }
  public float perimeter(){
    return (length+width)*2;
  }
}