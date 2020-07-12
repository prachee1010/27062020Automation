package oops.abstraction;

public class BankUser {

	public static void main(String[] args) {

		//calling static method sending obj as parameteter
		account(new SBI());		//SBI==Edge
		account(new ICICI());	//ICICI==Chrome
		account(new HDFC());	//HDFC==Firefox
	}

	public static void account(RBI bank) {	//RBI==WebDriver (it is interface)

		bank.creditCard();		//Navigate
		bank.debitCard();		//Click
		bank.savingAccount();	//Enter data
		bank.currentAccount();	//Select option
	}

}
