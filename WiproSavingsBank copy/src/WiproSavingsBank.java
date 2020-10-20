import java.util.ArrayList;

public class WiproSavingsBank {

	public int avail_bal = 0;
	public int min_bal = 0;
	public String name ="";
	public int age =0;
	public String address = "";
	ArrayList<String> ar = new ArrayList<String>();
	public WiproSavingsBank()
	{
		
	}
	public WiproSavingsBank(String name, int age, String address, int avail_bal, int min_bal)
	{
		this.name = name;
		this.age = age;
		this.address = address;
		this.min_bal = 1000;
		this.avail_bal=avail_bal;
	}
	public void deposit(int amount)
	{
		this.avail_bal += amount;
		miniStatement("Deposit", amount);
	}
	
	public void withdraw(int amount)
	{
		if((this.avail_bal - amount) > min_bal)
		{
			this.avail_bal -= amount;
			miniStatement("Withdrawal", amount);
		}
		else
		{
			System.out.println("Cannot Withdraw Beyond Minimum Balance Requirement");
			miniStatement("Withdrawal Denied", amount);
		}
	}
	public void balEnquiry()
	{
		System.out.println(avail_bal);
	}
	
	public void miniStatement(String action, int amount)
	{
		
		String str = action + ": " + amount;
		ar.add(str);
	}
	public void printMiniStatement()
	{
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Address: " + this.address);
		System.out.println(ar);
		
	}
	
	
	public static void main(String[] args) {
		WiproSavingsBank Bob = new WiproSavingsBank("Bob", 30, "Atlanta", 50000, 1000);
		WiproSavingsBank Sam = new WiproSavingsBank("Sam", 23, "Atlanta", 23000, 1000);
		
		Bob.deposit(1000);
		Bob.withdraw(10000);
		Bob.withdraw(100000);
		Bob.balEnquiry();
		Bob.printMiniStatement();
		System.out.println();
		Sam.deposit(1000);
		Sam.withdraw(10000);
		Sam.withdraw(100000);
		Sam.balEnquiry();
		Sam.printMiniStatement();

	}

}
