
public class Bank {
	
	String name;
	int accountBalance;
	Members mem;
	
	public int interestgained(int increment){
		
		accountBalance = accountBalance + increment;
		return accountBalance;
		
	}
	
	public Members getBalance(){
		
		return mem;
	}

}
