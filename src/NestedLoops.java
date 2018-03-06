
public class NestedLoops {

	public static void main(String[] args) {

		int count = 0;
		int i = 0;
		
		while(i<3){
			
			for(int j=0; j<4; j++){
				
				int k = 0;
				do{
					
					System.out.println("i is: "+i+" j is: "+j+" k is: "+k);
					k++;
					count++;
				}while(k<5);
			}
			
			i++;
		}
		
		System.out.println("");
		System.out.println("Total count is: "+count);
		
	}

}
