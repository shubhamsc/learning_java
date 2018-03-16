public class Account {
  private Integer accNo;
  private String name;
  private Double balance;
  private Integer transaction[];
  Account(Integer accNo,String name,Double balance){
    this.accNo = accNo;
    this.name = name;
    this.balance = balance;
  }
  void credit(Double amount){
    this.balance += amount;
  }
  void debit(Double amount){
    this.balance -= amount;
  }
  public String getName(){
    return this.name;
  }
  public Integer getAccountNo(){
    return this.accNo;
  }
  public Double getBalance(){
    return this.balance;
  }
  public void updateTransaction(Transaction transaction){
    this.transaction[length] = transaction;
  }
}