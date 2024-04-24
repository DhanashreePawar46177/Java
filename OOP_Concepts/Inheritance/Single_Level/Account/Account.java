package OOP_Concepts.Inheritance.Single_Level.Account;

public class Account {
	String acType;
	String bankName;
	
	public Account(String acType,String bankName) {
		this.acType = acType;
		this.bankName = bankName;
	}
	
	public void display() {
		System.out.println("Account Type = " +acType);
		System.out.println("Bank Name = " +bankName);
	}
}
