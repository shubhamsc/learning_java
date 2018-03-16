public class Bank {
  public void printDetails(Account account){
    System.out.println();
  }
  public static void main(String[] args) {
    Account account = new Account(1001,"shubham",0.0);
    System.out.println(account.getAccountNo());
    System.out.println(account.getName());
    System.out.println(account.getBalance());
    account.credit(100.0);
    System.out.println(account.getBalance());
  }
}