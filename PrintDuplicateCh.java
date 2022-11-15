package FullStackClass;

import java.util.Scanner;

public class PrintDuplicateCh {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=scan.next();
		s1=s1.toUpperCase();
		StringBuilder s2=new StringBuilder();
		char[] ch=s1.toCharArray();	
		boolean b1=false;
		for(int i=0;i<ch.length;i++) {
			
			for (int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					s2=s2.append(ch[i]);
					b1=true;
				}
				}
		}
		System.out.println(s2);
		if(b1==false) {
			System.out.println("No Duplicates found");
		}
	
	}
}
				
