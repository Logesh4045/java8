package java8;

public class UseFindMaxorMin {
	public static void main(String[]args) {
		FindLength f=new FindLength();
		FindMaxorMin max=f::findMax;
		FindMaxorMin min=FindLength::findMin;
		String[] name= {"logesh","Madan","Azar","Dinesh"};
		System.out.println(max.find(name));
		System.out.println(min.find(name));
	}

}
interface FindMaxorMin {
	public String find(String[] a);
}
