public class CreditTransaction extends Transaction{
  private String type = "Debit";
  CreditTransaction(String type){
    super();
    this.type = type;
  }
}