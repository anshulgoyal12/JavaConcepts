
public class ConditionsStatements {
	
		public static void main(String[] args) {
			
			int num = (int)(Math.random()*20);
			System.out.println(num);
			
			if(num>=10){
				
				System.out.println(num + " is Greater Then 10");
				
			}else if(num>5 && num<10){
					
					System.out.println(num + " is between 5 and 10");
				
			}else {
				
				System.out.println(num + " is Less Than 10");
			}
			
		}

}
