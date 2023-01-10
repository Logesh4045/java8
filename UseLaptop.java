package java8;

public class UseLaptop {
	public static void main(String[]args) {
		Laptop amount=(price,tax,discount)->System.out.println(price+tax-discount);
		Laptop percentage=(price,tax,discount)->System.out.println(price+(price*(tax/100)-price*(discount/100)));
		amount.netPrice(10000, 2000, 500);
		percentage.netPrice(1500, 10, 20);
		System.out.println(Laptop.printBrand("Hp"));
		System.out.println(amount.calculationPrice(false, 1500));
		

		
		
		
	}
	}
		
 interface Laptop {		
		public void netPrice(int price,int tax,int discount);
		public static String printBrand(String a) {
			return a;
		}
		public default int calculationPrice(boolean isTouch,int price) {
			if(isTouch) {
				return(price+100);
				
			}
			else {
				return (2000);
			}
		}
		
		}
	
