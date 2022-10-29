import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		int n=sc.nextInt();
		int sum=0,temp=n;
		
		do
		{
			int r=n%10;
			sum=sum+fact(r);
			n=n/10;
		}while(n!=0);
		
		if(sum==temp)
			System.out.println(temp+" Is Strong Number.");
		else
		System.out.println(temp+" Is Not Strong Number.");
	}
	
	static int fact(int n)
	{
		int fact=1;
		for(int i=n;i>0;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
}