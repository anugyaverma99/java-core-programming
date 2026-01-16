interface BankOperations{
	public void diposit(double balance);
	public void withdraw(double balance);
	public void checkBalance();
}
abstract class Account{
	private String accountNo;
	private String holderName;
	private double balance;
	Account(String accountNo,String holderName,double balance){
		this.accountNo=accountNo;
		this.holderName=holderName;
		this.balance=balance;
	}
	public double getBalance(){

	}
	public void setBalance(){
		
	}


}
class SavingsAccount extends Account implements BankOperations{
	SavingsAccount(String accountNo,String holderName,double balance){
		super(accountNo,holderName,balance);
	}
	public void deposit(double balance){

		this.balance+=balance;
		System.out.println("money deposited successfully in savings account");
	}
	public voidwithdraw(double balance){
		if(this.balance>=balance){
			System.out.println("Money withdrawn successfully from savings account");
			this.balance-=balance;
		}
	}
	public void checkBalance(){
		System.out.println("current balance of savings account: "+balance);
	}

}
class CurrentAccount extends Account implements BankOperations{
	CurrentAccount(String accountNo,String holderName,double balance){
		super(accountNo,holderName,balance);
	}
	public void deposit(double balance){

		this.balance+=balance;
		System.out.println("money deposited successfully to current account");
	}
	public withdraw(double balance){
		if(this.balance>=balance){
			System.out.println("Money withdrawn successfully from current account");
			this.balance-=balance;
		}
	}
	public void checkBalance(){
		System.out.println("current balance in current account: "+balance);
	}


}