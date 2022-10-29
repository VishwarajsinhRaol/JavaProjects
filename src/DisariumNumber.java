import java.util.Scanner;

public class DisariumNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		int n=sc.nextInt();
		boolean rs=isDisarium(n);
		if(rs==true)
			System.out.println(n+" Is Disarium Number.");
		else
			System.out.println(n+" Is Not Disarium Number.");
	}
	
	static boolean isDisarium(int n)
	{
		int sum=0,temp=n;
		int dc=digitCount(n);
		do
		{
			int r=n%10;
			sum=sum+pow(r,dc);
			dc--;
			n=n/10;
		}while(n!=0);
		
		if(sum==temp)
			return true;
		else
			return false;
	}
	
	static int digitCount(int n)
	{
		int count=0;
		do
		{
			count++;
			n=n/10;
		}while(n!=0);
		
		return count;
	}
	
	static int pow(int n,int p)
	{
		int prod=1;
		do
		{
			prod=prod*n;
			p--;
		}while(p>0);
		
		return prod;
	}
}