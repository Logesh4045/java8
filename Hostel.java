package java8;

public interface Hostel {
	public void calculateRent(boolean isAc,int rent);
	public static String hostelName(String name) {
		return "the hostel name is "+name;
	}

}
class PGHostel implements Hostel {
	public void calculateRent(boolean isAc,int rent) {
		if(isAc==true) {
			System.out.println(rent+1500);
			
		}
		else {
			System.out.println(20000);
		}
	}
}
