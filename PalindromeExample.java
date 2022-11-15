package FullStackClass;

import java.util.Scanner;

public class PalindromeExample {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner scan = new Scanner(System.in);
		String s2="";
		String s1= scan.nextLine();
		for (int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
			}
		System.out.println(s1);
		System.out.println(s2);
		if(s1.equalsIgnoreCase(s2)) 
			System.out.println("Given String is a Palindrome");
		else
			System.out.println("Not a Palindrome");
	}

}
