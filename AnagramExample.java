package FullStackClass;

import java.util.Arrays;
import java.util.Scanner;
class ReplaceSpace{
	public static String rmethod(String s1) {
		String sp="";
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=' ') {
				sp=sp+s1.charAt(i);
			}
		}
		return sp;
		}
	public static String lowermthd(String sp) {
		String sl="";
		for (int i=0;i<sp.length();i++) {
			if(sp.charAt(i)>='A'&& sp.charAt(i)<='Z') {
		sl=sl+(char)(sp.charAt(i)+32);
		}
			else
			{
				sl=sl+sp.charAt(i);
			}
		}
		return sl;
		
	}
}
public class AnagramExample {

	public static void main(String[] args) {
		System.out.println("Enter String 1 to check Anagram");
		Scanner scan = new Scanner(System.in);
		String s1= scan.nextLine();
		ReplaceSpace.rmethod(s1);
		System.out.println("Enter String 2 to check Anagram");
		String s2= scan.nextLine();
		String sp=ReplaceSpace.rmethod(s1);
		System.out.println(" String1 after the Replacing the spaces:"+ sp);
		String sl=ReplaceSpace.lowermthd(sp);
		System.out.println("String 1 converted to Lowercase: "+sl);
		String sp1=ReplaceSpace.rmethod(s2);
		System.out.println(" String2  after the Replacing the spaces:"+ sp1);
		String sll=ReplaceSpace.lowermthd(sp1);
		System.out.println("String 2 converted to Lowercase: "+sll);
		char[] ch=sl.toCharArray();
		char[] ch1=sll.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		if(Arrays.equals(ch, ch1)) {
			System.out.println("It's Anagram");
		}
		else
		{
			System.out.println("It's not Anagram");
		}
		}
		}
	


