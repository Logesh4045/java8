package java8;

public interface Employee {
	
		public default int printsalary(int salary) {
			return salary;
		}
		public static String printDesignation(String designation) {
			return "He is a "+designation;
		}
		
	}


class ItEmployee implements Employee {
	static int value=0;
	
	public ItEmployee() {
		value++;
		System.out.println(value);
	}
	
	public String printDesignation(String designation) {
		return designation;
	}
	public int pritsalary(int salary) {
		return salary+10000;
	}
}
