package Classtest;

public class Mainclass_Account {
	public static void main(String[] args) {
		Account__test account = new Account__test("박채연", 1000000);
		
		account.deposit(40000);
		account.withdraw(20000);
		account.showbalance();
	}

}
