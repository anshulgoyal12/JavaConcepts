
public class Variables {

	int i = 10;
	
	public int go(){
		
		i = 123;
		int j = 21;
		
		return i;
	}
	
	public static void main(String args[]){
		
		
		Variables vi = new Variables();
		int z = vi.i++;
		
		Variables vi2 = new Variables();
		int y = vi.i++;
		
		Variables vi3 = new Variables();
		int o = vi3.i;
		System.out.println(o);
	}
	
}
