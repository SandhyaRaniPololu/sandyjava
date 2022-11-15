package FullStackClass;

import java.util.Arrays;
import java.util.Scanner;

public class A1q4 {

	public static void main(String[] args) {
		System.out.println("Please enter String");
		Scanner scan= new Scanner(System.in);
		String s1=scan.nextLine();
		s1=s1.replace(" ", "");
		s1=s1.toLowerCase();
		System.out.println(s1);	
		int vCount=0,cCount=0,sc=0;
		for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i)=='a'|| s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
					vCount++;
				}
				else if(s1.charAt(i)>'a'&& s1.charAt(i)<'z') {
					cCount++;
				}
				else {
					sc++;
				}
			}			
		System.out.println(vCount);
		System.out.println(cCount);
		System.out.println(sc);
		}

	
}
