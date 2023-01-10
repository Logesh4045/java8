package java8;

class FindLength {
	public String findMax(String[] a) {
		String maxName=a[3];
		int tempp=0;
		int max=a[0].length();
		for(String x:a) {
			if(x.length()>=max) {
				max=x.length();
				maxName=x;
			}
		}
		return maxName;
	}
	public static String findMin(String[] a) {
		String minName="";
		int min=a[0].length();
		for(String i:a) {
			if(i.length()<=min){
				min=i.length();
				minName=i;
				
			}
		}
		return minName;
	}

}
