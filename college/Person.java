public class Person {
  private final String name;
  private final int age;
  private final String gender;
  Person(String name,int age,String gender){
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
  public String getDetails(){
    return this.name + " " + age + " " + gender;
  }
}