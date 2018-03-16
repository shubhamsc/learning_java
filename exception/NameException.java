public class NameException extends RuntimeException {
  NameException(Exception e){
    super("Name can\'t be empty!" ,e);
  }
  
}