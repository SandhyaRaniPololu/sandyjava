package FullStackClass;

public class MaximumOccCh {

	public static void main(String[] args) {
		String s1="ABCABBZZZZZ";
		char c=' ';
		int[] arr= new int[26];
		for(int i=0;i<s1.length();i++) {
			int index=s1.charAt(i)-65;
			arr[index]++;
		}
		int max=arr[0];
		for(int i=1;i<arr.length;i++) { 
				if(max<arr[i]) {
					max=arr[i];
				}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==max) {
				c=(char) (65+i);
				
			}
		}

		System.out.println(c);
		
		
	}

}
