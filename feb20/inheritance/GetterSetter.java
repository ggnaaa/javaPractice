package feb20;

class BankAccount{
    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public String getaccnumber(){
        return accountNumber;
    }
//    public void setaccnumber(String accountNumber){
//        this.accountNumber=accountNumber;
//    }

    public double getbalance(){
        return balance;
    }
//    public void setbalance(double balance){
//        this.balance=balance;
//    }
}

class SavingsAccount extends BankAccount{
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate=interestRate;
    }

    public double getInterestRate(){
        return interestRate;
    }
//    public void setInterestRate(double interestRate){
//        this.interestRate=interestRate;
//    }
}

public class GetterSetter {
    public static void main(String[] args) {
        SavingsAccount s=new SavingsAccount("asds12",32.33,45.5656);
        System.out.println(s.getaccnumber()+"\n"+s.getbalance()+"\n"+s.getInterestRate());
    }
}
