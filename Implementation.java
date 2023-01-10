package java8;

class Implementation {
	public int findMax(int[] a) {
		int max=a[0];
		for(int i:a) {
			if(i>max) {
				max=i;
			}
		}
		return max;
	}
	public static int findMin(int[] a) {
		int min=a[0];
		for(int i:a) {
			if(i<min){
				min=i;
			}
		}
		return min;
	}
	

}
