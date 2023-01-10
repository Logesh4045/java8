package java8;

public class UseMaxOrMin {
	public static void main(String[]args) {
		Implementation imp=new Implementation();
		//MaxOrMin max=imp::findMax;
		MaxOrMin max=new Implementation()::findMax;
		MaxOrMin min=Implementation::findMin;
		int[] nums= {-10,25,14,58,17,13,29};
		System.out.println(max.find(nums));
		System.out.println(min.find(nums));
		
	}

}
interface MaxOrMin {
	public int find(int[] a);
}
