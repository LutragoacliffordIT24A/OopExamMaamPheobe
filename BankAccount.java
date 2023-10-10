


 class BankAccount {
    private String name;
    private int age;
    private int account_Num;
    private double balance;

public String getName(){
        return name;
}
public void setName(String name){
    this.name = name;
}
public int getAge(){
    return age;
}
public void setAge(int age){
    this.age = age;
}
public int getAccountNum(){
    return account_Num;
}
public void setAccountNum(int account_Num){
    this.account_Num = account_Num;
}
public double getBalance(){
    return balance;
}
public void setBalance(double deposit1, double deposit2){
    this.balance = deposit1 + deposit2;
}
}

class Main{
   public static void main(String []args){
       BankAccount A = new BankAccount();
       A.setName("Clifford John B. Lutrago");
       A.setAge(24);
       A.setAccountNum(12);
       A.setBalance(12000.9, 15125.75);
       
       System.out.println("BankAccount: " + "\nName: " + A.getName() + "\nAge: " + A.getAge() + "\nAccountNumber: " + A.getAccountNum() + "\nBalance: " + A.getBalance());
   } 
}