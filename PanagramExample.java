package FullStackClass;

public class PanagramExample {

	public static void main(String[] args) {
	boolean b1=false;
		String s1="ABCABBZZZZZ";
		int[] arr= new int[26];
		for(int i=0;i<s1.length();i++) {
			int index=s1.charAt(i)-65;
			arr[index]++;
		}
    for(int i=0;i<arr.length;i++){
    	if(arr[i]==0) {
    		System.out.println("Given String is not a Panagram");
    		b1=true;
    		break;
    	}
    }
    	if(b1==false)
    	{
    		System.out.println("String is a Panagram");
    	}
		
		
		
	
	}	
    }


