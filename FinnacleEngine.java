class BankAccount {
	protected double balance;
	protected string accountNumber;
 
	public BankAccount (String accountNumber, double initialBalance){
		this.accountNumber= accountNumber;
		this.balance= initialBalance;
	}
	public void deposit(double amount, string source){
		balance += amount;
		System.out.println("Deposited:" +amount+"from"+source);
	}
	public void withdraw (double amount){
		if(amount <= balance){
			balance -= amount;
			System.out.println("withdraw:"+amount);
		}
		else
		{
			system.out.println("Insufficient balance");
		}
	}
}
class SavingsAccount extends BankAccount{
	private final double minBalance = 1000.00;
 
	public SavingsAccount(string accountNumber, double balance)
	{
		super (accountNumber, balance);
	}
	@override
	public void withdraw(double amount){
		if((balance-amount) >= minBalance)
		{
			balance-=amount;
			system.out.println("Savings withdraw=" +amount);
		}
		else
		{
			system.out.println("Denied, Must have minimum balance of: "+minBalance);
		}
	}
}
class CurrentAccount extends BankAccount{
	private final double overdraftLimit = 10000.00;
 
	public CurrentAccount (string accountNumber, double balance)
	{
		super(accountNumber,balance);
	}
	@override
	publicvoid withdraw(double amount){Ftest
		if(amount <=(balance+ overdraftLimit)
		{
			balance -= amount;
			system.out.println("Current account withdrawal Overdraft" + amount);
		}
		else
		{
			system..out.println("Overdraft limit has been exceeded. Transaction failed!);
		}
	}
}
public class FinnacleEngine
{
	public static void main (string [] args)
	{
			BankAccount myAccount = new SavingsAccount ("SAVE123",2000.00);
 
			myAccount.deposit (5000.00);
			myAccount.deposit (500.00, "Mobile Transaction");
 
			myAccount.withdraw(1500.00); 
	}
}