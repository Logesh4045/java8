package java8;

import java.util.Optional;

public class Optional_clss {
	public static void main(String[]args) {
		String[] str=new String[5];
		Optional<String>check=Optional.ofNullable(str[4]);
		if(check.isPresent()) {
		System.out.println(str[4].toUpperCase());
	}
		else{
			System.out.println("the Value is Null");
		}
		System.out.println(check);
	}


}
