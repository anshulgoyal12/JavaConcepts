
public class Company {
	
	
	public static void main(String args[]){
		
		Department d = new Department();
		Department d1 = new Department();
		
		d.dept_name = "IT";
		d.dept_id = 12345;
		d.no_of_emp = 100;
		
		Department.comp_name = "Microsoft";
		Department.national_holiday();
		
		d.add_dept();
		d.change_dept();
		
		d1.dept_name = "Sales";
		d1.dept_id = 12342;
		d1.no_of_emp = 103;
		
		d.add_dept();
		d.change_dept();
		
		System.out.println("Department_id : "+d.dept_id);
		System.out.println("Department_name : "+d.dept_name);
		System.out.println("Department Employees : "+d.no_of_emp);
		System.out.println("Company Name : "+Department.comp_name);
		
		System.out.println("Department_id : "+d1.dept_id);
		System.out.println("Department_name : "+d1.dept_name);
		System.out.println("Department Employees : "+d1.no_of_emp);
		System.out.println("Company Name : "+Department.comp_name);
	}
	

}
