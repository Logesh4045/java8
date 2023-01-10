package java8;

import java.util.Scanner;

public class ScannerCls {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.next();
		System.out.println("Hello"+name);
		System.out.println("Enter age:");
		int age=sc.nextInt();
		System.out.println("Age is"+age+"\n"+"Enter any satement");
		String sentence=sc.nextLine();
	}

}
