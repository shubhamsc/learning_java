public class Account {
  private int accNo;
  private String name;
  private double balance;
  private Integer transaction[];
  Account(int accNo, String name, double balance){
    this.accNo = accNo;
    this.name = name;
    this.balance = balance;
  }
  void credit(double amount){
    this.balance += amount;
  }
  void debit(double amount){
    this.balance -= amount;
  }
  public String getName(){
    return this.name;
  }
  public int getAccountNo(){
    return this.accNo;
  }
  public double getBalance(){
    return this.balance;
  }
  public void updateTransaction(Integer transaction){
    this.transaction[0] = transaction;
  }
}
