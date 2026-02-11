class Account{
 private int balance;
 public void setBalance(int b){ balance=b; }
 public int getBalance(){ return balance; }
 public static void main(String[] args){
  Account a=new Account();
  a.setBalance(5000);
  System.out.println(a.getBalance());
 }
}
