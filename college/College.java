public class College {
  public void printDetails(Person person){
    System.out.println(person.getDetails());
  }
  public static void main(String[] args) {
   new Person("Shubham",21,"Male").printDetails();
  }
}