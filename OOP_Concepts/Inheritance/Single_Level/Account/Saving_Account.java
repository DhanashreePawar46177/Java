package OOP_Concepts.Inheritance.Single_Level.Account;

public class Saving_Account {
	int acNo;
	String acHolderName;

	Account a = new Account("abc","BOB");
	
	public Saving_Account(int acNo, String acHolderName) {
		this.acNo = acNo;
		this.acHolderName = acHolderName;
		a.display();
	}
	
}
