package FullStackClass;

import java.util.Scanner;

public class UniqueStringExample {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=scan.next();
		s1=s1.toUpperCase();
		StringBuilder s2=new StringBuilder();
		StringBuilder s3=new StringBuilder();
		char[] ch=s1.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			Boolean b1=false;
			for (int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					s3=s3.append(ch[i]);
					b1=true;
					break;
				}
			}
			if(!b1) {
				s2=s2.append(ch[i]);
			}
		}
if(s3.length()!=0) 
	System.out.println("Given String has duplicate characters");
else 
	System.out.println("Unique String");
	}
}