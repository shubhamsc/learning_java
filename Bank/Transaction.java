public class Transaction {
  private String type;
  private Double amount;
  Transaction(String type,Double amount){
    this.type = type;
    this.amount = amount;
  }
  public Transaction getTransaction(){
    return this;
  }
}