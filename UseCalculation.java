package java8;


public class UseCalculation {
	public static void main(String[]args) {
		Calculation div=(a,b)->a/2;
	    Calculation add=(int a,int b)->a+b;
		Calculation sub=(a,b)->a-b;
		Calculation mul=(a,b)->a*b;
		System.out.println(add.math(10,15));
		System.out.println(sub.math(20,10));
		
}

public interface Calculation {

		public int math(int a,int b);
		public default void excute() {
			System.out.println("the program is excuted");
		}

	}
}