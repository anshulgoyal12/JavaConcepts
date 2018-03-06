
public class Exception1 {

	public static void main(String[] args) {

		System.out.println("Before try block");
		
		try{
			
		System.out.println("Begining");
		
		int divide = 10/0;
		System.out.println(divide);
		
		System.out.println("Ending");
		
		}catch(Exception e){
			
			System.out.println("Error Occurred");
			System.out.println(e.getMessage());
			e.printStackTrace();
		
		 
	   }finally{
		   
		   System.out.println("Ending");
		   
	   }
		
		System.out.println("After try block");
		
    }

}
