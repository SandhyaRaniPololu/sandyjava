// Guesser game with Dynamic number of players
package FullStackClass;

import java.util.Scanner;
class Umpire{
void collectNum(int n) {
	int count=0;
	int winners = 0;
	int[] arr=new int[n+1];
	
	System.out.println("Guesser enter the number");
	Scanner scan= new Scanner(System.in);
	arr[0]=scan.nextInt();
	for(int i=1;i<=n;i++) {
		System.out.println("Enter the number Player"+i);
		arr[i]=scan.nextInt();
	}
	
		for(int j=1;j<=n;j++) {
			if(arr[0]==arr[j]) {
				winners++;
				if(winners==1)
				{
					System.out.println("Winners are");
				}
				
				System.out.println("Player"+j);
				}
			else {
				count++;
			}
		}
		if(count==n) {
			System.out.println("All the Players lost the match");
		}
	}
}
public class GuesserProject {
	public static void main(String[] args) {
		System.out.println("Enter the no of players in the match");
		Scanner scan = new Scanner(System.in);
		 int n=scan.nextInt();
		Umpire obj=new Umpire();
		obj.collectNum(n);
	}	
	}

