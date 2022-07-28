package suraj;

public class CustomerAcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int accountNumber = 123;
		int accountBalance = 100;
		int amount=500;
		String customerName="abc";             
		
		customerDetails customer1 = new customerDetails();
		customer1.createAccount(accountNumber,customerName,accountBalance);
		customer1.getAmount();

		customer1.depositAmount(amount);
		customer1.getAmount();
		customer1.withdrawAmount(amount);
		customer1.getAmount();
	}
	}

	class customerDetails
	{
		private int accNumber;
		private String accHolderName;
		private int accBalance;
	public void createAccount(int accountNumber, String customerName, int accountBalance)
	{
		setAccNumber(accountNumber);
		accHolderName = customerName;
		accBalance = accountBalance;
	}
	public void depositAmount(int amount)
	{	
		System.out.println("You are depositing. "+amount);	
		accBalance += amount;
	}
	public void withdrawAmount(int Amount)
	{
		System.out.println("You are withdrawing "+Amount);	
	 	accBalance -= Amount;
		
	}
	public void getAmount()
	{
		System.out.println(accHolderName+" Sir You Have "+accBalance+" in Your Account");

	}
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

}
