package java8;

public class UseEmployee {
	public static void main(String[]args) {
		ItEmployee i=new ItEmployee();
		ItEmployee i1=new ItEmployee();
		ItEmployee i2=new ItEmployee();
		System.out.println(i.printDesignation("HR"));
		System.out.println(i.printsalary(20000));
		System.out.println(Employee.printDesignation("Manager"));
		System.out.println(ItEmployee.value);
	}

}
