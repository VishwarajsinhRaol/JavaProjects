import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		int n=sc.nextInt();
		int sum=0,prod=1,temp=n;
	
		do
		{
			int r=n%10;
			sum=sum+r;
			prod=prod*r;
			n=n/10;
		}while(n!=0);
		
		if(sum==prod)
			System.out.println(temp+" Is Spy Number.");
		else
			System.out.println(temp+" Is Not Spy Number.");
	}
}