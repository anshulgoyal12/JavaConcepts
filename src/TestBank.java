
public class TestBank {
	
	public static void main(String args[]){
		
	Bank b1 = new Bank();
	
	b1.name = "HSBC";
	b1.accountBalance = 10000;
	b1.interestgained(500);
	System.out.println(b1.accountBalance);
	
	Members m = new Members();
	
	m.add = "1801 south avenue, California";
	m.name = "Jack Daniels";
	
	b1.mem = m;
	
	System.out.println(b1.mem.add);
	System.out.println(b1.mem.name);
	
	Bank b2 = new Bank();
	
	b2.name = "Barclays";
	b2.accountBalance = 150000;
	b2.interestgained(1300);
	
	System.out.println("");
	
	System.out.println(b2.accountBalance);
	
	b2.mem = new Members();
	
	b2.mem.add = "12 road street, LA";
	b2.mem.name = "Cory";
	
	System.out.println(b2.mem.add);
	System.out.println(b2.mem.name);
	System.out.println("");
	
	Members m2 = b2.getBalance();
	m2.deposit();
	m2.withdrawl();
	
	System.out.println("");
	b2.getBalance().deposit();
	b2.getBalance().withdrawl();
	
	}
	
}
