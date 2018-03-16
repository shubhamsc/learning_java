public class CreditTransaction extends Transaction{
  private String type = "Credit";
  CreditTransaction(String type){
    super();
    this.type = type;
  }
}