
public class Departments implements Employee {

	public static void main(String[] args) {

		Employee e = new Departments();
		e.salary();
		e.hrPolicy();
		
		
	}

	@Override
	public void salary() {
		
		System.out.println("Credit salary to this month");
		
	}

	@Override
	public void hrPolicy() {
		
		System.out.println("Add all the HR Policy");
		
	}

	

}
