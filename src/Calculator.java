
public class Calculator {

	 int x = 20;
	 int y = 10;
	
	public static void main(String args[]){
		
		Calculator cal = new Calculator();
		
		System.out.println(cal.add());
		System.out.println(cal.substract());
		System.out.println(cal.mul());
		System.out.println(cal.div());
		
		
	}
	
	public int add(){
		
		int z = x + y;
		return z;
		
	
	}
	
	public int substract(){
		
		int p = x - y;
		return p;
		
	}
	
	public int mul(){
		
		int m = x*y;
		return m;

	}
	
	public int div(){
		
		int d = x/y;
		return d;
		
	}
}
