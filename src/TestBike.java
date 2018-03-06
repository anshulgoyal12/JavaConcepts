
public class TestBike {
	
	public static void main(String args[]){
		
		Bike b1 = new Bike();
		b1.color = "Black";
		b1.startBike();
		
		MakeHonda m = new MakeHonda();
		m.color = "Red";
		m.startBike();
		m.tyreType();
		m.stopBike();
		
		Bike b2 = new MakeHonda();
		b2.startBike();
		
		
	}

}
