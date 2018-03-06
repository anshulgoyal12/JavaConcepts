
public class Students {
	
	String name;
	int age;
	int rollno;
	
	public Students(){
		
		System.out.println("Students records added successfully");
		
	}
	
	public Students(String name, int age, int rollno){
		
		this.name = name;
		this.age = age;
		this.rollno = rollno;
		
		System.out.println("Students records added successfully");
	}
	

	public static void main(String[] args) {

		Students s1 = new Students();
		
		s1.name = "Steve";
		s1.age = 25;
		s1.rollno = 3;
		
		System.out.println(s1.name+" "+ s1.age +" "+s1.rollno);
		System.out.println("");
		
		Students s2 = new Students();
		
		s2.name = "Ben";
		s2.age = 27;
		s2.rollno = 1;
			
		System.out.println(s2.name+" "+ s2.age +" "+s2.rollno);
		System.out.println("");

		Students s3 = new Students("Raman", 24, 5);
		
		System.out.println("Student name is : "+s3.name);
		System.out.println("Student age is : "+s3.age);
		System.out.println("Student roll no is : "+s3.rollno);
		
	}

}
